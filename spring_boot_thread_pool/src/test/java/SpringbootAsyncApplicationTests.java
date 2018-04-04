import com.thread.SpringbootAsyncApplication;
import com.thread.task.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;

/**
 * Created by piguanghua on 3/23/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootAsyncApplication.class)
public class SpringbootAsyncApplicationTests {
    @Autowired
    private AsyncTask asyncTask;


}
