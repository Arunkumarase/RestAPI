package quiz.abstracts.question22;

abstract class B extends A
{
    @Override
    void methodOne()
    {
        System.out.println(i);
        System.out.println(j);
        i = ++i;
        j = --j;
    }
}
