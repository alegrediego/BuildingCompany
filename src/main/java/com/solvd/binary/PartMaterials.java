package com.solvd.binary;

public class PartMaterials {

    public PartMaterials(){

    }

    public long getPartMaterialsID() {
        return PartMaterialsID;
    }

    public void setPartMaterialsID(long partMaterialsID) {
        PartMaterialsID = partMaterialsID;
    }

    public String getPartMaterialsName() {
        return PartMaterialsName;
    }

    public void setPartMaterialsName(String partMaterialsName) {
        PartMaterialsName = partMaterialsName;
    }

    public String getPartMaterialsDescription() {
        return PartMaterialsDescription;
    }

    public void setPartMaterialsDescription(String partMaterialsDescription) {
        PartMaterialsDescription = partMaterialsDescription;
    }

    long PartMaterialsID;

    String PartMaterialsName, PartMaterialsDescription;
}
