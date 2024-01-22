package quiz.classesandobjects.question8;

public class StaticInitializationBlock
{
    static
    {
        System.out.println(3);
    }

    public static void main(String[] args)
    {
        System.out.println(4);
        System.out.println(A.first);
        System.out.println(A.second);
    }

}
