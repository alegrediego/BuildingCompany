package com.solvd.dao.inter;

import com.solvd.binary.Suppliers;
import java.util.List;

public interface ISuppliersDAO extends IEntityDAO<Suppliers> {

List<Suppliers> getSuppliers();
Suppliers getSuppliers(int id);
}
