package singeletonMultithreading;

import singeleton.DataBaseConnection;

import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    //private static final ReentrantLock lock = new ReentrantLock();


    private String url;
    private String username;
    private String password;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {

        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if(instance == null) {
                    instance = new DatabaseConnection();
                }

            }

        }
        return instance;


    }
}

