package quiz.enums.question10;

enum Levels
{
    TOP, MEDIEUM(10), BOTTOM(20, 30);

    int i, j;

    private Levels()
    {

    }

    private Levels(int i)
    {
        this.i = i;
    }

    private Levels(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
}
