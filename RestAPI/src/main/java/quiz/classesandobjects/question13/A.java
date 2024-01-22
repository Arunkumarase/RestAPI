package quiz.classesandobjects.question13;

public class A
{
    {
        System.out.println("First");
    }

    {
        System.out.println("Second");
    }

    {
        System.out.println("Third");
    }

    public A()
    {
        System.out.println("Fourth");
    }

    public static void main(String[] args)
    {
        System.out.println("Fifth");

        A a = new A();
    }
}
