package quiz.incrementdecrement.question13;

public class A {
    public static void main(String[] args)
    {
        int x = 001, y=010, z=100;

        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
    }
}
