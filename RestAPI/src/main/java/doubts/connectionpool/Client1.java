package doubts.connectionpool;

public class Client1 {
    public static void main(String[] args) {
        ConnectionPool instance = ConnectionPoolImpl1.getInstance(10);
        System.out.println(instance.getAvailableConnectionsCount());
        System.out.println(instance.getTotalConnectionsCount());
        DatabaseConnection connection = instance.getConnection();
        System.out.println(instance.getAvailableConnectionsCount());
        instance.releaseConnection(connection);
        instance.releaseConnection(connection);
        instance.releaseConnection(connection);
        instance.releaseConnection(connection);
        instance.releaseConnection(connection);
        System.out.println(instance.getAvailableConnectionsCount());

    }
}
