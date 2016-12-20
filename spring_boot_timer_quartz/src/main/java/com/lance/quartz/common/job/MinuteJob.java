package com.lance.quartz.common.job;


import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 该方法仅仅用来测试每分钟执行
 * @author lance
 */
@Slf4j
public class MinuteJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info("JobName: {}", context.getJobDetail().getKey().getName());
	}
}