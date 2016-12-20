package com.lance.quartz.common.job;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@lombok.extern.slf4j.Slf4j
public class Minute3Job implements Job {


	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info("JobName3: {}", context.getJobDetail().getKey().getName());
	}

}
