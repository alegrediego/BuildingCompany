package com.solvd.binary;

public class Departments extends Company{

    private long DepartmentID;

    public Departments(long DepartmentID, long comp) {
        this.DepartmentID = DepartmentID;
        this.CompanyID = comp;
    }


    public Departments(){

    }

    public static void getDepartmentID(long id) {
    }

    public long getDepartmentID() {
        return DepartmentID;
        
    }

    public void setDepartmentID(long departmentID) {
        DepartmentID = departmentID;
    }

}
