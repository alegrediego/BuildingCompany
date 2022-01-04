package com.solvd.binary;

public class Suppliers {

    public Suppliers(){

    }

    public long getSuppliersID() {
        return SuppliersID;
    }

    public void setSuppliersID(long suppliersID) {
        SuppliersID = suppliersID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
    }

    long SuppliersID;
   String SupplierName;
}
