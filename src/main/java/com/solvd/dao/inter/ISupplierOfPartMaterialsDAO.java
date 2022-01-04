package com.solvd.dao.inter;

import com.solvd.binary.SupplierOfPartMaterials;
import java.util.List;
public interface ISupplierOfPartMaterialsDAO extends IEntityDAO<SupplierOfPartMaterials> {

    List<SupplierOfPartMaterials> getSupplierOfPartMaterials();
    SupplierOfPartMaterials getSupplierOfPartMaterials(int id);
}
