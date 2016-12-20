import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by piguanghua on 2016/12/19.
 */
public class HelloQuartz implements Job {



    public HelloQuartz() {

    }

    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        System.out.println(new Date());
        }
}
