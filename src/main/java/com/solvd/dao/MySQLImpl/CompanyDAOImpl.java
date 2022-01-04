package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Company;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.ICompanyDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CompanyDAOImpl extends AbstractDAO implements ICompanyDAO {

    private static final String GET_COMPANY_BY_ID = "SELECT * FROM Company WHERE id=?";
    private static final String GET_USER_ALL = "SELECT * FROM Company";

    List<Company> company;

    @Override
    public void save(Company company) {

    }

    @Override
    public Company getById(long id) {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
            con = getCon();
            ps = con.prepareStatement(GET_COMPANY_BY_ID);
            ps.setLong(1,id);
            rs = ps.executeQuery();
           while (rs.next()){
                Company company = new Company();
                rs.getInt(1);
                company.setCompanyID(id);
                return company;
            }
        } catch (SQLException e) {
            ;
        }
        finally {

        }
        return null;

    }

    @Override
    public List<Company> getCompany() {
        Company company = null;
        List<Company> companyList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_USER_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                company = new Company();
                company.setCompanyID(rs.getLong("id"));
                company.setCompanyName(rs.getString("Name"));
                companyList.add(company);
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
            return companyList;
        }

    }

    @Override
    public Company getCompany(int id) {
        return company.get(id);
    }




}

