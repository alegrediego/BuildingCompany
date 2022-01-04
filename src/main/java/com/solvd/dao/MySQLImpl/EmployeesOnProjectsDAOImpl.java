package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Departments;
import com.solvd.binary.EmployeesOnProjects;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.IEmployeesOnProjectDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesOnProjectsDAOImpl extends AbstractDAO implements IEmployeesOnProjectDAO {


    private static final String GET_EMPLOYEESONPROJECTS_BY_ID = "SELECT * FROM EmployeesOnProjects WHERE id=? ";
    private static final String GET_EMPLOYEESONPROJECTS_ALL = "SELECT FROM EmployeesOnProjects";

    @Override
    public List<EmployeesOnProjects> getEmployeesOnProject() {
        EmployeesOnProjects employeesOnProjects = null;
        List<EmployeesOnProjects> employeesOnProjectsList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_EMPLOYEESONPROJECTS_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                employeesOnProjects = new EmployeesOnProjects();
                employeesOnProjects.setEmployeedID(rs.getLong("id"));
                employeesOnProjects.setProjectID(rs.getLong("id"));
                employeesOnProjects.setStartDate(rs.getDate(""));
                employeesOnProjects.setEndDate(rs.getDate(""));
                employeesOnProjectsList.add(employeesOnProjects);
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
            return employeesOnProjectsList;
        }
    }

    @Override
    public EmployeesOnProjects getEmployeesOnProject(int id) {
        return null;
    }

    @Override
    public void save(EmployeesOnProjects employeesOnProjects) {

    }

    @Override
    public EmployeesOnProjects getById(long id) {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
            con = getCon();
            ps = con.prepareStatement(GET_EMPLOYEESONPROJECTS_BY_ID);
            ps.setLong(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                EmployeesOnProjects employeesOnProjects = new EmployeesOnProjects();
                rs.getInt(1);
                employeesOnProjects.getEmployeedID();
                return employeesOnProjects;
            }
        } catch (SQLException e) {
            ;
        }
        finally {

        }
        return null;
    }
}
