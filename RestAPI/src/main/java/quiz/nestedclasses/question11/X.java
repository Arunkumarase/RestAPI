package quiz.nestedclasses.question11;

class X
{
    {
        System.out.println(1);
    }

    static
    {
        System.out.println(2);
    }

    public X()
    {
        new Y();
    }

    static class Y
    {
        {
            System.out.println(3);
        }

        static
        {
            System.out.println(4);
        }
    }
}
