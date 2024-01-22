package quiz.classesandobjects.question46;

public class ClassTwo {
    {
        System.out.println('B');
    }

    public static void main(String[] args)
    {
        char c;

        c = ClassOne.getC();

        System.out.println(c);
    }
}
