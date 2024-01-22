package doubts.connectionpool;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = new DatabaseConnection();
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(int maxConnections){
        return databaseConnection;
    }

    public static void resetInstance(){
        databaseConnection = null;
    }
}
