package quiz.classesandobjects.question32;

public class ClassTwo {

    {
        System.out.println(5);
    }

    public static void main(String[] args)
    {
        System.out.println(6);
        ClassOne one = new ClassOne();
        ClassOne two = new ClassOne(10);
    }
}
