package br.com.flexait.jobs;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.typeCompatibleWith;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;

import br.com.flexait.jobs.JobSchedulerTest.JobOne;

public class JobWrapperTest {

	JobWrapper wrapper;
	
	@Before
	public void setUp() throws Exception {
		wrapper = new JobWrapper(Job.class, JobBuilder.newJob(JobOne.class).build());
	}

	@Test
	public void shouldReturnJobType() {
		assertThat(wrapper.getJob(), typeCompatibleWith(Job.class));
	}
	
	@Test
	public void shouldReturnJobWrapper() {
		assertThat(wrapper.getWrapper(), instanceOf(JobDetail.class));
	}

}