package com.patterncat;

import com.patterncat.model.Bar;
import com.patterncat.model.Foo;
import com.patterncat.receiver.ReceiverService;
import com.patterncat.sender.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Random;
import java.util.UUID;

@SpringBootApplication
@ComponentScan(basePackages = "com.patterncat")
public class RabbitmqdemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqdemoApplication.class, args);
	}

	/*@Autowired
	SenderService senderService;

	@Override
	public void run(String... strings) throws Exception {
		Random random = new Random();
		while (true){
			senderService.sendBar2Rabbitmq(new Bar(random.nextInt()));
			senderService.sendFoo2Rabbitmq(new Foo(UUID.randomUUID().toString()));
		}
	}*/
}
