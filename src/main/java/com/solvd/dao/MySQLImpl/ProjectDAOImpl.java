package com.solvd.dao.MySQLImpl;

import com.solvd.binary.Departments;
import com.solvd.binary.Projects;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.IProjectsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectDAOImpl extends AbstractDAO implements IProjectsDAO {
    private static final String GET_PROJECTS_BY_ID = "SELECT * FROM Projects WHERE id=?";
    private static final String GET_PROJECTS_ALL = "SELECT * FROM Projects";

    @Override
    public void save(Projects projects) {

    }

    @Override
    public Projects getById(long id) {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try{
            con = getCon();
            ps = con.prepareStatement(GET_PROJECTS_BY_ID);
            ps.setLong(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                Projects projects = new Projects();
                rs.getInt(1);
                projects.setProjectID(rs.getLong(""));
                return projects;
            }
        } catch (SQLException e) {
            ;
        }
        finally {

        }
        return null;
    }

    @Override
    public List<Projects> getProject() {
        Projects projects = null;
        List<Projects> projectsList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_PROJECTS_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                projects = new Projects();
                projects.setProjectID(rs.getLong(""));
                projects.setProjectName(rs.getString(""));
                projects.setStartDate(rs.getDate(""));
                projects.setEndDate(rs.getDate(""));
                projectsList.add(projects);
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
            return projectsList;
        }

    }

    @Override
    public Projects getProjects(int id) {
        return null;
    }
}
