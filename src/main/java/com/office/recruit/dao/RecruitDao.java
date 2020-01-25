package com.office.recruit.dao;

import com.office.recruit.model.JobDetails;
import java.util.List;

public interface RecruitDao {
	
	public String saveJob(JobDetails job); 
	public String updateJob(JobDetails job);
	public String deleteJob(int jobId);
	public List<JobDetails> getAllJob();
	

	

}
