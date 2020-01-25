package com.office.recruit.service;

import java.util.List;

import com.office.recruit.model.JobDetails;

public interface RecruitService {
	
	public String addNewJob(JobDetails job);
	public String jobUpdate(JobDetails job);
	public String jobDelete(int jobId);
	public List<JobDetails> getAllJob();
	public List<JobDetails> serachJob(String jobDesc);
	
	

}
