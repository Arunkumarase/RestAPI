package quiz.nestedclasses.question26;

class X
{
    int x = 111;

    class Y extends X
    {
        int y = x + 222;
    }

    class Z extends X.Y
    {
        int z = y + 333;
    }
}
