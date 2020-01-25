package com.office.recruit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.office.recruit.dao.RecruitDaoImplementation;
import com.office.recruit.model.JobDetails;

@Service
public class RecruitServiceImplementation implements RecruitService{
	
	
	@Autowired
	RecruitDaoImplementation dao;

	@Override
	public String addNewJob(JobDetails job) {
		System.out.println("Service Layer new job ");
		dao.saveJob(job);
		return "job vacancy";
		
	}
	
	@Override
	public String jobUpdate(JobDetails job) {
		System.out.println("Service Layer job update ");
		dao.updateJob(job);
		return "update job";
		
	}

	@Override
	public String jobDelete(int jobId) {
		System.out.println("Service Layer delete job ");
		dao.deleteJob(jobId);
		return "delete job";
	}

	@Override
	public List<JobDetails> getAllJob() {
		System.out.println("service layer get all job");
		List<JobDetails> jobs = dao.getAllJob();
		return jobs;
	}

	@Override
	public List<JobDetails> serachJob(String jobDesc) {
		System.out.println("service layer serach job");
		List<JobDetails> jobs = dao.getAllJob();
		List<JobDetails> searchResult = new ArrayList<JobDetails>();
		for(JobDetails job: jobs) {
			if(job.getJobDescription().contains(jobDesc)) {
			   searchResult.add(job);
			}
		}
		
		
		return searchResult;
	}


	


}
