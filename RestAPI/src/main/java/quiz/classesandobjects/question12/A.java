package quiz.classesandobjects.question12;

class A
{
    {
        System.out.println(1);
    }
    public A()
    {
        System.out.println(2);
    }

    public static void main(String[] args)
    {
        System.out.println(3);
        A a = new A();
    }
}
