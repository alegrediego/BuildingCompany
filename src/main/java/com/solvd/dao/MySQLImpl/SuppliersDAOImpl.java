package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Suppliers;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.ISuppliersDAO;

import java.util.List;

public class SuppliersDAOImpl extends AbstractDAO implements ISuppliersDAO {
    @Override
    public void save(Suppliers suppliers) {

    }

    @Override
    public Suppliers getById(long id) {
        return null;
    }

    @Override
    public List<Suppliers> getSuppliers() {
        return null;
    }

    @Override
    public Suppliers getSuppliers(int id) {
        return null;
    }
}
