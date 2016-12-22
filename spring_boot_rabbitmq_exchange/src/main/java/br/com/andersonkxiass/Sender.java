package br.com.andersonkxiass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.com.andersonkxiass.model.Message;

@Service
@EnableScheduling //@EnableScheduling：标注启动定时任务。
public class Sender {

	@Autowired
	private RabbitMessagingTemplate rabbitMessagingTemplate;
	@Autowired
	private MappingJackson2MessageConverter mappingJackson2MessageConverter;

	public void sendToRabbitmq(Message host, String extraContent){
		
		this.rabbitMessagingTemplate.setMessageConverter(this.mappingJackson2MessageConverter);

		Map<String, Object> header = new HashMap<>();
		header.put("extraContent", extraContent);

		this.rabbitMessagingTemplate.convertAndSend("exchange", "queue.message", host, header);
	}
	
	public void sendListToRabbitmq(List<Message>  listHost,  String extraContent){
		
		this.rabbitMessagingTemplate.setMessageConverter(this.mappingJackson2MessageConverter);
		
		Map<String, Object> header = new HashMap<>();
		header.put("extraContent", extraContent);

		this.rabbitMessagingTemplate.convertAndSend("exchange", "queue.messages", listHost, header);
	}

	@Scheduled(fixedRate = 100)
	public void sendMessageTest(){
		String extraContent = "extraContent";
		Map<String, Object> header = new HashMap<>();
		header.put("extraContent", extraContent);
		Message message = new Message("zhang");

		this.rabbitMessagingTemplate.convertAndSend("exchange", "queue.message", "zhang" , header);
	}
}