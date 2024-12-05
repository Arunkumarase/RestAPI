package doubts.singleton;

public class Main {
    public static void main(String[] args) {
        FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl = new FileBasedConfigurationManagerImpl();
        Student student = Student.getInstance();
        Student student1 = Student.getInstance();

        if (student1 == student) {
            System.out.println("Both are same!!");
        } else {
            System.out.println("Both are different!");
        }
        //Thread thread = new Thread();

    }

}
