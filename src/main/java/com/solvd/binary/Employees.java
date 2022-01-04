package com.solvd.binary;

import org.apache.logging.log4j.core.appender.db.jdbc.AbstractDriverManagerConnectionSource;

import java.sql.Date;

public class Employees extends Departments {

    public Employees(){

    }

    public long getEmployeedID() {
        return EmployeedID;
    }

    public void setEmployeedID(long employeedID) {
        EmployeedID = employeedID;
    }

    public long getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(long jobTitle) {
        JobTitle = jobTitle;
    }

    @Override
    public long getDepartmentID() {
        return DepartmentID;
    }

    @Override
    public void setDepartmentID(long departmentID) {
        DepartmentID = departmentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmpleadoscol() {
        return Empleadoscol;
    }

    public void setEmpleadoscol(String empleadoscol) {
        Empleadoscol = empleadoscol;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    long EmployeedID, JobTitle, DepartmentID;
   String FirstName, LastName,  Empleadoscol, EmailAddress, Address;
   int PhoneNumber;
   Date DateOfBirth;


    public Employees(long DepartmentID) {

    }

    public Employees(long EmployeedID, long JobTitle,
                     long  comp1, String FirstName, String LastName, String  Empleadoscol, String EmailAddress,
                     int PhoneNumber, String Address, Date DateOfBirth){
        this.EmployeedID = EmployeedID;
        this.JobTitle = JobTitle;
        this.DepartmentID = comp1;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Empleadoscol = Empleadoscol;
        this.EmailAddress = EmailAddress;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
        this.DateOfBirth = DateOfBirth;
    }
}
