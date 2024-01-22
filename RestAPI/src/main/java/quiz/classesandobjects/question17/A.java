package quiz.classesandobjects.question17;

public class A {
    static int i = 10;
    int j = 100;

    {
        methodOne();
        i = 100;
        j = 10;
    }

    void methodOne()
    {
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }

    public static void main(String[] args)
    {
        A a = new A();
        a.methodOne();
    }
}
