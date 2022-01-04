package com.solvd.binary;

import java.util.Date;

public class Projects {

    public Projects(){

    }

    public long getProjectID() {
        return ProjectID;
    }

    public void setProjectID(long projectID) {
        ProjectID = projectID;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    long ProjectID;
    String ProjectName;
    Date StartDate, EndDate;
}
