package com.office.recruit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.office.recruit.model.JobDetails;

@Repository
public  class RecruitDaoImplementation implements RecruitDao{
	
	@Autowired
	Connection conn;

	@Override
	public String saveJob(JobDetails job) {
		System.out.println("Repository layer");
		try {
			PreparedStatement s = conn.prepareStatement("insert into job_details(Job_Id, Job_Desc, Tech_skill, Experince, Salary, Notice_period) values(?,?,?,?,?,?)");
			s.setInt(1, job.getId());
			s.setString(2, job.getJobDescription());
			s.setString(3, job.getTechnicalSkill());
			s.setInt(4, job.getExperince());
			s.setInt(5, job.getSalary());
			s.setInt(6, job.getNoticePeriod());
		    s.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Job posted";
	}
	
	@Override
	public String updateJob(JobDetails job) {
		System.out.println("Repository layer"+job);
		try {
			PreparedStatement s = conn.prepareStatement("UPDATE job_details SET Job_Desc=?,Tech_skill=?, Experince=?, Salary=?, Notice_period=? where Job_Id=?");
			s.setString(1, job.getJobDescription());
			s.setString(2, job.getTechnicalSkill());
			s.setInt(3, job.getExperince());
			s.setInt(4, job.getSalary());
			s.setInt(5, job.getNoticePeriod());
			s.setInt(6, job.getId());
		    s.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Job updated";
	}
	
	@Override
	public String deleteJob(int jobId) {
		System.out.println("Repository layer"+jobId);
		try {
			PreparedStatement s = conn.prepareStatement("delete from job_details where Job_Id = ?");
			s.setInt(1, jobId);
		    s.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Job deleted";
	}
	
	@Override
	public List<JobDetails> getAllJob() {
		System.out.println("Repository layer");
		List<JobDetails> list = new ArrayList<JobDetails>();
		try {
			JobDetails job = null;
			PreparedStatement s = conn.prepareStatement("select * from job_details");
		    ResultSet result = s.executeQuery();
		    while(result.next()) {
		    	job = new JobDetails();
		    	job.setId(result.getInt("Job_Id"));
		    	job.setJobDescription(result.getString("Job_Desc")); 
		    	job.setTechnicalSkill(result.getString("Tech_skill")); 
		    	job.setExperince(result.getInt("Experince"));
		    	job.setSalary(result.getInt("Salary"));
		    	job.setNoticePeriod(result.getInt("Notice_period"));
		    	list.add(job);
		  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
	
}
