package quiz.nestedclasses.question16;

class B
{
    A a = new A()
    {
        void methodA1(int i)
        {
            System.out.println(++i+i++);
        }

        void methodA2(int i)
        {
            System.out.println(i---i);
        }
    };
}
