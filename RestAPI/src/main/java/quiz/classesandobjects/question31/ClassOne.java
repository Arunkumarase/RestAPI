package quiz.classesandobjects.question31;

class ClassOne
{
    static int i = 10;

    static
    {
        i = 20;
    }

    public ClassOne(int i)
    {
        System.out.println(i);

        this.i = i;
    }

    {
        i = 30;
    }
}
