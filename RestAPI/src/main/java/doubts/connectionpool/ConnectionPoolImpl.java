package doubts.connectionpool;
import java.util.*;

public class ConnectionPoolImpl implements ConnectionPool {

    private int maxConnections;
    private int availableConnections;
    private Map<DatabaseConnection, Boolean> connectionPools = new HashMap<>();

    private Queue<DatabaseConnection> dbQueue;
    private static ConnectionPoolImpl instance;

    private ConnectionPoolImpl() {}

    public static ConnectionPool getInstance(int maxConnections) {
        if (instance == null) {
            synchronized(ConnectionPoolImpl.class) {
                instance = new ConnectionPoolImpl();
                instance.maxConnections = maxConnections;
                instance.availableConnections = maxConnections;
                instance.initializePool();
            }
        }
        return instance;
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            connectionPools.put(new DatabaseConnection(), true);
        }
    }

    @Override
    public DatabaseConnection getConnection() {
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
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if (connectionPools.containsKey(connection)) {
            if (!connectionPools.get(connection)) {
                connectionPools.put(connection, true);
                this.availableConnections += 1;
            }
        }

    }

    @Override
    public int getAvailableConnectionsCount() {
        return this.availableConnections;
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.maxConnections;
    }
}