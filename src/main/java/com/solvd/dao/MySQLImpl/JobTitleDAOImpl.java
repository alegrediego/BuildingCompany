package com.solvd.dao.MySQLImpl;

import com.solvd.binary.JobTitle;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.IJobTitleDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobTitleDAOImpl extends AbstractDAO implements IJobTitleDAO {
    private static final String GET_JOBTITLE_BY_ID = "SELECT * FROM JobTitle WHERE id=?";
    private static final String GET_JOBTITLE_ALL = "SELECT * FROM JobTitle";

    @Override
    public void save(JobTitle jobTitle) {

    }

    @Override
    public JobTitle getById(long id) {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
            con = getCon();
            ps = con.prepareStatement(GET_JOBTITLE_BY_ID);
            ps.setLong(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                JobTitle jobTitle = new JobTitle();
                rs.getInt(1);
                jobTitle.getJobTitle();
                return jobTitle;
            }
        } catch (SQLException e) {
            ;
        }
        finally {

        }
        return null;
    }

    @Override
    public List<JobTitle> getJobTitle() {
        JobTitle jobTitle = null;
        List<JobTitle> jobTitleList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_JOBTITLE_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                jobTitle = new JobTitle();
                jobTitle.setJobTitle(rs.getLong(""));
                jobTitle.setJobTitleName(rs.getString(""));
                jobTitle.setJobTitleName(rs.getString(""));
                jobTitleList.add(jobTitle);
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
            return jobTitleList;
        }
    }

    @Override
    public JobTitle getJobTitle(int id) {
        return null;
    }
}
