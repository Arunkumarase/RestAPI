package doubts.singleton;

public class Student {
    private String name;
    private String mailId;
    private String contactNumber;

    private Student() {}

    public static Student student;

    public static Student getInstance() {
        if (student == null) {
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }
}
