package prototype;

public class Student implements Cloneable{
    String name;
    int age;
    int contactNumber;
    String mailId;
    String city;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = new Student();
        student.name = this.name;
        student.age = this.age;
        return student;
    }
}
