package quiz.nestedclasses.question10;

class A
{
    void methodOne()
    {
        class B
        {
            void methodTwo()
            {
                System.out.println("Method Two");
            }
        }
    }

    void methodThree()
    {
        //new B().methodTwo();
    }
}
