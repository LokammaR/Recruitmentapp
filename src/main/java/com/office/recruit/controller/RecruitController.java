package com.office.recruit.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.office.recruit.model.JobDetails;
import com.office.recruit.service.RecruitServiceImplementation;




@RestController
public class RecruitController {
	
	@Autowired
	RecruitServiceImplementation service;
	
	@PostMapping("/recruit")
	public String newJob(@RequestBody JobDetails job) {
		System.out.println("Job openings  "+job);
		service.addNewJob(job);
		return "new job";
	}
		
	@PutMapping("/update")
	public String jobUpdate(@RequestBody JobDetails job) {
		System.out.println("Job update  "+job);
		service.jobUpdate(job);
		return "job updated";
	}
	
	@DeleteMapping("/delete")
	public String jobDelete(@RequestParam int jobId) {
		System.out.println("Job update  "+jobId);
		service.jobDelete(jobId);
		return "job no longer available";
	}
	
	
	@GetMapping("/allJob")
	public List<JobDetails> getAllJobDetails() {
		System.out.println("all job details");
		List<JobDetails> result = service.getAllJob();
		Collections.sort(result);
		return result ;
	}
		
	
	@GetMapping("/search")
	public List<JobDetails> serachJob(@RequestParam String jobDescription){
		System.out.println("serach job");
		List<JobDetails> searcch = service.serachJob(jobDescription);
		return searcch;
		
	}
	}

