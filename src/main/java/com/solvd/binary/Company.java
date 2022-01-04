package com.solvd.binary;

public class Company {
   public long CompanyID;
   public String CompanyName;

    public Company(){

}

    public Company(long companyID) {
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public long getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(long companyID) {
        CompanyID = companyID;
    }

    public Company(long CompanyID, String CompanyName){
    this.CompanyID = getCompanyID();
    this.CompanyName = getCompanyName();
}

    public void remove(long companyID) {
    }
}

