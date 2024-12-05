package doubts.builder;

public class Employee {

    private String name;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.getName();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    static class EmployeeBuilder {
        private String name;

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Employee build() {
            Employee employee = new Employee(this);
            return employee;
        }
    }

}
