package doubts.connectionpool;

import java.util.*;

public class ConnectionPoolImpl1 implements ConnectionPool {

    private int maxConnections;
    //private int availableConnections;
    //private Map<DatabaseConnection, Boolean> connectionPools = new HashMap<>();
    private Queue<DatabaseConnection> dbQueue;
    private static ConnectionPoolImpl1 instance;

    private ConnectionPoolImpl1() {}

    public static ConnectionPool getInstance(int maxConnections) {
        if (instance == null) {
            synchronized(ConnectionPoolImpl1.class) {
                instance = new ConnectionPoolImpl1();
                instance.maxConnections = maxConnections;
                //instance.availableConnections = maxConnections;
                instance.dbQueue = new LinkedList<>();
                instance.initializePool();
            }
        }
        return instance;
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            //connectionPools.put(new DatabaseConnection(), true);
            dbQueue.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        /**
         DatabaseConnection availConnection = null;
         for (DatabaseConnection key: connectionPools.keySet()) {
         if (connectionPools.get(key) == true) {
         availConnection = key;
         this.availableConnections -= 1;
         connectionPools.put(key, false);
         break;
         }
         }
         return availConnection;
         */

        return dbQueue.poll();



    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        /**
         if (connectionPools.containsKey(connection)) {
         connectionPools.put(connection, true);
         this.availableConnections += 1;
         } */
        if (!dbQueue.contains(connection)) {
            dbQueue.add(connection);
        }
    }

    @Override
    public int getAvailableConnectionsCount() {
        //return this.availableConnections;
        return dbQueue.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.maxConnections;
    }

    public static void resetInstance() {
        instance = null;
    }
}
