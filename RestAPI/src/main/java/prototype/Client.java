package prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.name = "Manish";
        student.age = 15;
        Student student2 = student.clone();
        System.out.println(student2.name);
        Map<Student,Integer> prototype = new HashMap<>();
        prototype.put(student,15);
        prototype.put(student2,10);
        
    }
}
