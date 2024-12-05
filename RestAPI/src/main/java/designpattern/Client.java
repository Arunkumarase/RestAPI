package designpattern;

public class Client {

    public static void main(String[] args) {

        Thread t1 = new Thread(Student::getInstance);
        Thread t2 = new Thread(Student::getInstance);
        Thread t3 = new Thread(Student::getInstance);
        Thread t4 = new Thread(Student::getInstance);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
