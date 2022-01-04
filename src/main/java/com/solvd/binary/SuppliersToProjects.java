package com.solvd.binary;

public class SuppliersToProjects {
    public SuppliersToProjects(){

    }

    public long getSuppliersID() {
        return SuppliersID;
    }

    public void setSuppliersID(long suppliersID) {
        SuppliersID = suppliersID;
    }

    public long getProjectID() {
        return ProjectID;
    }

    public void setProjectID(long projectID) {
        ProjectID = projectID;
    }

    long SuppliersID, ProjectID;
}
