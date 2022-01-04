package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Company;
import com.solvd.binary.Employees;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.IEmployeesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAOImpl extends AbstractDAO implements IEmployeesDAO {


    private static final String GET_EMPLOYEES_ALL = "SELECT * FROM Employees ";
    private static final String GET_EMPLOYEES_BY_ID = "SELECT * FROM Employees WHERE id=?";

    @Override
    public List<Employees> getEmployees() {
        Employees employees = null;
        List<Employees> employeesList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_EMPLOYEES_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                employees = new Employees();
                employees.setEmployeedID(rs.getLong("id"));
                employees.setFirstName(rs.getString("First Name"));
                employees.setLastName(rs.getString("Last Name"));
                employees.setAddress(rs.getString("Address"));
                employees.setEmpleadoscol(rs.getString("Empleadoscol"));
                employees.setDepartmentID(rs.getLong("DepartmentID"));
                employees.setDateOfBirth(rs.getDate("DateOfBirth"));
                employees.setEmailAddress(rs.getString("EmailAddress"));
                employees.setJobTitle(rs.getLong("JobTitle"));
                employees.setPhoneNumber(rs.getInt("PhoneNumber"));

                employeesList.add(employees);
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
            return employeesList;
        }
    }

    @Override
    public Employees getEmployees(int id) {
        return null;
    }

    @Override
    public void save(Employees employees) {

    }

    @Override
    public Employees getById(long id) {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
            con = getCon();
            ps = con.prepareStatement(GET_EMPLOYEES_BY_ID);
            ps.setLong(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                Employees employees = new Employees();
                rs.getInt(1);
                employees.setEmployeedID(id);
                return employees;
            }
        } catch (SQLException e) {
            ;
        }
        finally {

        }
        return null;
    }
}
