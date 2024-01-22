package quiz.classesandobjects.question9;

public class A {
    static int i;

    static
    {
        i = 100;

        System.out.println(1);
    }

    static void staticMethod()
    {
        System.out.println(i);

        System.out.println(2);
    }
}
