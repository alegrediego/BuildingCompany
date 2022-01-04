package com.solvd.dao.inter;

import com.solvd.utils.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class AbstractDAO {
    private ConnectionPool connectionPool = ConnectionPool.getInstance();

    public Connection getCon() throws SQLException {
        return ConnectionPool.getInstance().getConnection();
    }

    public void realizeConnection(Connection connection){
        ConnectionPool.getBack(connection);
    }


    }
