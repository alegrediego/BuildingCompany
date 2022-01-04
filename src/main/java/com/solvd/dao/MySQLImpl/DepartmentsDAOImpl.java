package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Departments;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.IDepartmentsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentsDAOImpl extends AbstractDAO implements IDepartmentsDAO {
    private static final String GET_DEPARTMENTS_BY_ID = "SELECT * FROM Departments WHERE id=?";
    private static final String GET_DEPARTMENTS_ALL="SELECT * FROM Departments ";

    List <Departments> departments;

    @Override
    public void save(Departments departments) {

    }

    @Override
    public Departments getById(long id) {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
            con = getCon();
            ps = con.prepareStatement(GET_DEPARTMENTS_BY_ID);
            ps.setLong(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                Departments departments = new Departments();
                rs.getInt(1);
                departments.getDepartmentID(id);
                return departments;
            }
        } catch (SQLException e) {
            ;
        }
        finally {

        }
        return null;

    }

    @Override
    public List<Departments> getDepartments() {
        Departments departments = null;
        List<Departments> departmentsList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_DEPARTMENTS_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                departments = new Departments();
                departments.setDepartmentID(rs.getLong("id"));
                departments.setCompanyName(rs.getString("Name"));
                departmentsList.add(departments);
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
            return departmentsList;
        }
    }

    @Override
    public Departments getDepartments(int id) {

        return departments.get(id);
    }
}



