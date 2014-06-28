package br.com.flexait.jobs;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class JobScheduler {

	private final List<JobWrapper> jobs;
	
	public JobScheduler() {
		jobs = new ArrayList<>();
	}
	
	public JobScheduler add(Class<? extends Job> job) {
		notNull(job);
		JobDetail jobDetail = jobDetail(job);
		jobs.add(new JobWrapper(job, jobDetail));
		
		return this;
	}

	private void notNull(Object object) {
		if(object == null) {
			throw new IllegalArgumentException("Job not be null");
		}
	}
	
	private JobDetail jobDetail(Class<? extends Job> job) {
		return JobBuilder
		.newJob(job)
		.withIdentity(job.getName())
		.build();
	}

	public Integer count() {
		return jobs.size();
	}

}
