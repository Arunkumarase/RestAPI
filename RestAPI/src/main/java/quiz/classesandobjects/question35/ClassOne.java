package quiz.classesandobjects.question35;

public class ClassOne {
    String s;

    {
        s = "FIRST";
    }

    {
        s = "SECOND";
    }

    public ClassOne()
    {
        s = "THIRD";
    }

    public ClassOne(String s)
    {
        this();

        System.out.println(this.s);
    }
}
