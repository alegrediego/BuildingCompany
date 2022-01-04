package com.solvd.binary;

public class JobTitle extends Employees {

    public JobTitle(long JobTitle1, String JobTitleName, String JobTibleDescription){
        this.JobTitle = JobTitle1;
        this.JobTitleName = JobTitleName;
        this.JobTitleDescription = JobTibleDescription;

    }
    public long getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(long jobTitle) {
        JobTitle = jobTitle;
    }

    public String getJobTitleName() {
        return JobTitleName;
    }

    public void setJobTitleName(String jobTitleName) {
        JobTitleName = jobTitleName;
    }

    public String getJobTitleDescription() {
        return JobTitleDescription;
    }

    public void setJobTitleDescription(String jobTitleDescription) {
        JobTitleDescription = jobTitleDescription;
    }

    long JobTitle; String JobTitleName, JobTitleDescription;

    public JobTitle(){

    }


}


