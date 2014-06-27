package br.com.flexait.jobs;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobSchedulerTest {

	JobScheduler job;
	
//	static class JobOne implements Run {
//		@Override
//		public void execute(JobExecutionContext arg0)
//				throws JobExecutionException {
//		}
//	}
	
	@Before
	public void setUp() throws Exception {
		job = new JobScheduler();
	}

//	@Test
//	public void shouldAddAJobItem() {
//		JobScheduler jobScheduler = job.add(JobOne.class);
//		assertThat(job.count(), equalTo(1));
//		assertThat(jobScheduler, equalTo(jobScheduler));
//	}

}
