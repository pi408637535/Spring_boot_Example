

import com.it.demo.Application;
import com.it.demo.domain.Person;

import com.it.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests
{

	@Resource
	private DemoService demoService;

	@Test
	public void testCache() throws Exception {
		Person person = new Person("cache", 19, "nameCache");

		demoService.save(person);
		demoService.findOne(person);
		demoService.findOne(person);
	}

}
