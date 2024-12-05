package doubts.connectionpool;

public class Client {
    public static void main(String[] args) {
        ConnectionPool instance = ConnectionPoolImpl.getInstance(10);
        System.out.println(instance.getAvailableConnectionsCount());
        System.out.println(instance.getTotalConnectionsCount());
        DatabaseConnection connection = instance.getConnection();
        System.out.println(instance.getAvailableConnectionsCount());
        DatabaseConnection connection1 = instance.getConnection();
        System.out.println(instance.getAvailableConnectionsCount());
        DatabaseConnection connection2 = instance.getConnection();
        System.out.println(instance.getAvailableConnectionsCount());
        instance.releaseConnection(connection2);
        instance.releaseConnection(connection2);
        instance.releaseConnection(connection2);
        instance.releaseConnection(connection2);
        instance.releaseConnection(connection2);
        instance.releaseConnection(connection2);
        System.out.println(instance.getAvailableConnectionsCount());

    }
}
