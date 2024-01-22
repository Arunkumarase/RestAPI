package quiz.classesandobjects.question47;

class ClassOne
{
    {
        s = "second";
    }

    String s = "first";

    {
        System.out.println(s);

        s = "third";
    }

    public ClassOne()
    {
        System.out.println(s);
    }

    public ClassOne(String s)
    {
        System.out.println(s);

        this.s = s;
    }
}
