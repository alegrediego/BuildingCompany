package com.solvd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.utils.ConnectionPool;


import java.sql.SQLException;
import java.util.concurrent.CompletableFuture;

public class Main {
    private static final Logger log = LogManager.getLogger(String.valueOf(Main.class));
    public static void main( String[] args )
    {
        ConnectionPool cp = ConnectionPool.getInstance();

        CompletableFuture<Void> thread1 = CompletableFuture
                .runAsync(() -> {
                    try {
                        cp.getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });
    }
}
