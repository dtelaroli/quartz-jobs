package br.com.flexait.jobs;

import org.quartz.Job;

public interface Run extends Job {

	Class<? extends Job> getJob();
	
}
