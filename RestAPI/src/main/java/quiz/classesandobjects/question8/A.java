package quiz.classesandobjects.question8;

public class A {
    static int first;

    static String second;

    static
    {
        System.out.println(1);

        first = 100;
    }

    static
    {
        System.out.println(2);

        second = "SECOND";
    }
}

