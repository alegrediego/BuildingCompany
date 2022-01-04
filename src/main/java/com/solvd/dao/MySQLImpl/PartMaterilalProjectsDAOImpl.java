package com.solvd.dao.MySQLImpl;

import com.solvd.binary.PartMaterialProjects;
import com.solvd.dao.inter.AbstractDAO;
import com.solvd.dao.inter.IPartMaterialProjectsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartMaterilalProjectsDAOImpl extends AbstractDAO implements IPartMaterialProjectsDAO {
    private static final String GET_PARTMATERIALPROJECTS_ALL = "SELECT * FROM PartMaterialProjects" ;

    @Override
    public void save(IPartMaterialProjectsDAO iPartMaterialProjectsDAO) {

    }

    @Override
    public IPartMaterialProjectsDAO getById(long id) {

        return null;
    }



    @Override
    public List<PartMaterialProjects> getMaterialProjects() {
        PartMaterialProjects partMaterialProjects = null;
        List<PartMaterialProjects> partMaterialProjectsList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = getCon();
            ps = connection.prepareStatement(GET_PARTMATERIALPROJECTS_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                partMaterialProjects = new PartMaterialProjects();
                partMaterialProjects.setPartMaterialsID(rs.getLong(""));
                partMaterialProjects.setProjectID(rs.getLong(""));
                partMaterialProjectsList.add(partMaterialProjects);

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
            return partMaterialProjectsList;
        }
    }

    @Override
    public PartMaterialProjects getMaterialProjects(int id) {
        return null;
    }
}
