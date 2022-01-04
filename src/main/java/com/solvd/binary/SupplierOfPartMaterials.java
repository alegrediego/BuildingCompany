package com.solvd.binary;

public class SupplierOfPartMaterials {
    public long getPartMaterialsID() {
        return PartMaterialsID;
    }

    public SupplierOfPartMaterials(){

    }

    public void setPartMaterialsID(long partMaterialsID) {
        PartMaterialsID = partMaterialsID;
    }

    public long getSuppliersID() {
        return SuppliersID;
    }

    public void setSuppliersID(long suppliersID) {
        SuppliersID = suppliersID;
    }

    long PartMaterialsID, SuppliersID;
}
