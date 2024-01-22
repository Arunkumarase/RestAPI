package quiz.classesandobjects;

class A
{
    static int i;

    static
    {
        System.out.println(1);
        i = 100;
    }
    public static void main(String[] args)
    {
        System.out.println(3);
        //System.out.println(A.i);
        question3 q = new question3();
    }
}
public class question3 {
    static
    {
        System.out.println(2);
    }


}
