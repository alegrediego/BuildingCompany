package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Departments;
import com.solvd.binary.SupplierOfPartMaterials;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.ISupplierOfPartMaterialsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierOfPartMaterialsDAOImpl extends AbstractDAO implements ISupplierOfPartMaterialsDAO {
    private static final String GET_SUPPLIEROFPARTMATERIALS_ALL = "SELECT * FROM SupplierOfPartMaterials";

    @Override
    public void save(SupplierOfPartMaterials supplierOfPartMaterials) {

    }

    @Override
    public SupplierOfPartMaterials getById(long id) {


        return null;
    }

    @Override
    public List<SupplierOfPartMaterials> getSupplierOfPartMaterials() {

        SupplierOfPartMaterials supplierOfPartMaterials = null;
        List<SupplierOfPartMaterials> supplierOfPartMaterialsList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_SUPPLIEROFPARTMATERIALS_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                supplierOfPartMaterials = new SupplierOfPartMaterials();
                supplierOfPartMaterials.setPartMaterialsID(rs.getLong(""));
                supplierOfPartMaterials.setSuppliersID(rs.getLong(""));
                supplierOfPartMaterialsList.add(supplierOfPartMaterials);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            realizeConnection(connection);
            try {
                if (rs != null && ps != null) {
                    rs.close();
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return supplierOfPartMaterialsList;
        }
    }

    @Override
    public SupplierOfPartMaterials getSupplierOfPartMaterials(int id) {
        return null;
    }
}
