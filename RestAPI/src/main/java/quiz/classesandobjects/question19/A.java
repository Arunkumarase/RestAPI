package quiz.classesandobjects.question19;

public class A {
    {
        System.out.println(1);
    }

    static
    {
        System.out.println(2);
    }

    public A()
    {
        System.out.println(3);
    }

    public static void main(String[] args)
    {
        System.out.println(4);
        A a = new A();
    }
}
