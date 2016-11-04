package com.gome.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*你不需要将所有的 @Configuration 放进一个单独的类， @Import 注解可以用来导入其他配置
类。另外，你也可以使用 @ComponentScan 注解自动收集所有Spring组件，包
括 @Configuration 类*/
/*导入XML
如果必须使用XML配置，建议你仍旧从一个 @Configuration 类开始，然后使
用 @ImportResource 注解加载XML配置文件。

@SpringBootApplication 注解等价于以默认属性使
用 @Configuration ， @EnableAutoConfiguration 和 @ComponentScan
*/
@SpringBootApplication
//@Configuration
//@Import({AutoConfig.class})
@ComponentScan({"com.gome.wp"})
//@EnableAutoConfiguration    //springboot使用spring,springmvc,tomcat的默认配置
public class Application implements EmbeddedServletContainerCustomizer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
		configurableEmbeddedServletContainer.setPort(80);
	}
}
