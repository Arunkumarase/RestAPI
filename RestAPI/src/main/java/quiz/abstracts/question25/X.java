package quiz.abstracts.question25;

abstract class X
{
    int i = 111;

    int methodX()
    {
        return methodX(i);
    }

    abstract int methodX(int i);
}
