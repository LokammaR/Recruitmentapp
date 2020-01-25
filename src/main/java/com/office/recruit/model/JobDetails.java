package com.office.recruit.model;


public class JobDetails implements Comparable<JobDetails>{
	
	private int id;
	private String jobDescription;
	private String technicalSkill;
	private int experince;
	private int salary;
	private int noticePeriod;
	
	
	
	public JobDetails(int id, String jobDescription, String technicalSkill, int experince, int salary,
			int noticePeriod) {
		super();
		this.id = id;
		this.jobDescription = jobDescription;
		this.technicalSkill = technicalSkill;
		this.experince = experince;
		this.salary = salary;
		this.noticePeriod = noticePeriod;
	}
	
	public JobDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getTechnicalSkill() {
		return technicalSkill;
	}
	public void setTechnicalSkill(String technicalSkill) {
		this.technicalSkill = technicalSkill;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	@Override
	public String toString() {
		return "JobDetails [id=" + id + ", jobDescription=" + jobDescription + ", technicalSkill=" + technicalSkill
				+ ", experince=" + experince + ", salary=" + salary + ", noticePeriod=" + noticePeriod + "]";
	}
	@Override
	public int compareTo(JobDetails arg0) {
		
		return this.id-arg0.id ;
	}
	
	
}
	
	

