import com.demo.jpa.Application;
import com.demo.jpa.dao.PersonRepository;
import com.demo.jpa.domain.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests
{

	@Autowired
	private PersonRepository personRepository;

	@Test
	public void testSave() throws Exception {

		// 创建10条记录
		personRepository.save(new Person("name", 10, "china"));
		//System.out.println(personRepository.findAll().size());
	}

	@Test
	public void testFind() throws Exception {
		System.out.println(personRepository.findByName("name"));
	}


}
