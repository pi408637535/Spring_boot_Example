package com.lance.quartz.common.job;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@lombok.extern.slf4j.Slf4j
public class Minute2Job implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info("JobName2: {}", context.getJobDetail().getKey().getName());
	}

}
