package br.com.flexait.jobs;

import java.util.ArrayList;
import java.util.List;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class JobScheduler {

	private final List<Run> jobs;
	
	public JobScheduler() {
		jobs = new ArrayList<>();
	}
	
	public JobScheduler add(Class<? extends Run> job) {
//		Run run = job.newInstance();
//		JobDetail jobDetail = JobBuilder
//		.newJob(run.getJob())
//		.withIdentity(job.getSimpleName())
//		.build();
//		
//		job.setJob(run);
//		
//		jobs.put(job, jobDetail);
		
		return this;
	}

	public Integer count() {
		return jobs.size();
	}

}
