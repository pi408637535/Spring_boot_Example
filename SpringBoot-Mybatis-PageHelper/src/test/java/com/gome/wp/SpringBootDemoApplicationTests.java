package com.gome.wp;

import com.gome.wp.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private HelloController helloController;

	@Before
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
	}

	@Test
	public void testHello() throws Exception{
		/*ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON));
		resultActions.andExpect(status().isOk());
		resultActions.andExpect(content().string(equalTo("hello world!!")));*/
	}

}
