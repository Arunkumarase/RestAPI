package quiz.classesandobjects.question9;

public class B {
    static
    {
        System.out.println(3);
    }

    public static void main(String[] args)
    {
        System.out.println(4);
        System.out.println(A.i);
        A.staticMethod();
    }
}
