package quiz.abstracts.question25;

class Y extends X
{
    @Override
    int methodX(int i)
    {
        return ++i + i++;
    }
}
