package co.paan.configuration;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.elasticsearch.common.settings.Settings;
import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by hungnguyen on 12/16/14.
 */
@Configuration
@PropertySource(value = "classpath:elasticsearch.properties")
@EnableElasticsearchRepositories(basePackages = "co.paan.repository")
public class ElasticsearchConfiguration {
    @Resource
    private Environment environment;

    //    用于提供单例的TransportClient BulkProcessor
    static public TransportClient tclient = null;

    @Bean
    public Client client() {
        try {
            if (tclient == null) {
              //  String EsHosts = "10.10.2.1:9300,10.10.2.2:9300";
                String EsHosts = "118.244.212.185:9300";
                Settings settings = Settings.settingsBuilder()
                        .put("cluster.name", "wshare_es")//设置集群名称
                        .put("tclient.transport.sniff", true).build();//自动嗅探整个集群的状态，把集群中其它机器的ip地址加到客户端中

                tclient = TransportClient.builder().settings(settings).build();
                String[] nodes = EsHosts.split(",");
                for (String node : nodes) {
                    if (node.length() > 0) {//跳过为空的node（当开头、结尾有逗号或多个连续逗号时会出现空node）
                        String[] hostPort = node.split(":");
                        tclient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(hostPort[0]), Integer.parseInt(hostPort[1])));

                    }
                }
            }//if
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tclient;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }


}
