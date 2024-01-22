package quiz.incrementdecrement.question16;

public class A {
    public static void main(String[] args)
    {
        char ch = "123".charAt(1);
        System.out.println(ch);
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(ch++ + ++ch);
    }
}
