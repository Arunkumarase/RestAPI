package designpattern;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Student {
    static Lock lock = new ReentrantLock();
    static Semaphore semaphore = new Semaphore(1);

    private static Student student;
    private Student(){}

//    public static Student getInstance(){
//        if (student == null){
//            synchronized (Student.class) {
//                System.out.println("Inside sync");
//                if (student == null) {
//                    System.out.println("Student object created");
//                    student = new Student();
//                }
//            }
//        }
//        return student;
//    }

//    public static Student getInstance(){
//
//        if (student == null) {
//            lock.lock();
//            System.out.println("Inside lock");
//            if (student == null) {
//                System.out.println("Student object created");
//                student = new Student();
//            }
//            lock.unlock();
//        }
//        return student;
//    }

    public static Student getInstance(){

        if (student == null) {
            try {
                semaphore.acquire();
                System.out.println("Inside semaphore");
                if (student == null) {
                    System.out.println("Student object created");
                    student = new Student();
                }
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return student;
    }
}
