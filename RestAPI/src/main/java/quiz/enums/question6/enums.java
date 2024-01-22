package quiz.enums.question6;

enum Enums
{
    A, B, C;

    {
        System.out.println(1);
    }

    static
    {
        System.out.println(2);
    }

    private Enums()
    {
        System.out.println(3);
    }
}
