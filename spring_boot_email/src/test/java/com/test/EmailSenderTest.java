package com.test;

import com.lance.email.EmailSender;
import com.lance.email.SimpleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SimpleApplication.class)
public class EmailSenderTest {
	@Autowired
	private EmailSender emailSender;

	@Test
	public  void test(){
		System.out.println("tttt");

	}

	@Test
	public void sender() {
		String to = "piguanghua@wordemotion.com";
		String subject = "Test subject";
		String content = "Hello Spring boot Email.";
		
		boolean result = emailSender.sender(to, subject, content);
		//logger.info("-------------======---------------"+result);
	}
}
