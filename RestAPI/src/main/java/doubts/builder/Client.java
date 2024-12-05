package doubts.builder;

public class Client {
    public static void main(String[] args) {
        Employee employee = Employee.getBuilder()
                .withName("Arun")
                .build();
        System.out.println(employee);
    }
}
