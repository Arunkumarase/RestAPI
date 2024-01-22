package quiz.nestedclasses.question16;

public class MainClass {
    public static void main(String[] args)
    {
        A a = new A();
        a.methodA1(10);
        a.methodA2(10);
        B b = new B();
        b.a.methodA1(10);
        b.a.methodA2(10);
    }
}
