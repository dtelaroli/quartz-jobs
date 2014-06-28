package br.com.flexait.jobs;

import org.quartz.Job;
import org.quartz.JobDetail;

public class JobWrapper {

	private final Class<? extends Job> job;
	private final JobDetail jobDetail;
	
	public JobWrapper(Class<? extends Job> job, JobDetail jobDetail) {
		this.job = job;
		this.jobDetail = jobDetail;
	}
	
	public Class<? extends Job> getJob() {
		return job;
	}

	public String getName() {
		return job.getName();
	}

	public JobDetail getWrapper() {
		return jobDetail;
	}
	
}