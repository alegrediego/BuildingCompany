package com.solvd.binary;

import java.util.Date;

public class EmployeesOnProjects {

   public Date getEndDate() {
      return EndDate;
   }

   public void setEndDate(Date endDate) {
      EndDate = endDate;
   }

   public Date getStartDate() {
      return StartDate;
   }

   public void setStartDate(Date startDate) {
      StartDate = startDate;
   }

   public long getEmployeedID() {
      return EmployeedID;
   }

   public void setEmployeedID(long employeedID) {
      EmployeedID = employeedID;
   }

   public long getProjectID() {
      return ProjectID;
   }

   public void setProjectID(long projectID) {
      ProjectID = projectID;
   }

   Date EndDate,StartDate;

   long EmployeedID, ProjectID;

   public EmployeesOnProjects(){

   }
}
