package quiz.nestedclasses.question9;

public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.s);
        System.out.println("11111111111111");
        System.out.println(A.s);
        A.B b = a.new B();
        System.out.println(b.s);
        b.methodB();
    }
}
