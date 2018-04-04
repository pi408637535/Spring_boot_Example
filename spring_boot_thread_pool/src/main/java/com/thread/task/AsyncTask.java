package com.thread.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.stockemotion.common.utils.HttpClientUtil;
import com.stockemotion.common.utils.JsonUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by piguanghua on 3/23/18.
 */
@Component
public class AsyncTask {
    @Async("myTaskAsyncPool") //myTaskAsynPool即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
    public void doTask1(int i,String text) throws InterruptedException{
        String  url = "http://123.196.116.201:8001/wd/forum/topic/tweet";

        JSONArray mentionUsers = new JSONArray();
        JSONArray pictures = new JSONArray();
        JSONObject topicAttach = new JSONObject();
        topicAttach.put("mentionUsers", mentionUsers);
        topicAttach.put("pictures", pictures);
        topicAttach.put("sourceId", "1060");

        JSONObject topic = new JSONObject();
        topic.put("topicAttach", topicAttach);
        topic.put("terminal", 0);
        topic.put("terminalIp", "192.168.1.42");
        topic.put("title", "");
        topic.put("topicContent", "通知：为了给大家营造良好的学习，建立一个免费交流学习q 裙【70896】验证00名额有限，速速加入，裙内每天推荐强势个股、分析个股");
        topic.put("type", "feed");

        Map<String, String> heads = new HashMap<String, String>();
        heads.put("Authorization", "fbc98ddab0204646ad8ffd2a649588620e6834133cc34c529eda1d7a2bd649d1");
        heads.put("deviceType", "1");
        heads.put("version", "14");


        System.out.println(topic.toJSONString());

        String result = HttpClientUtil.doPostJson(url, topic.toJSONString(), heads);
    }
}
