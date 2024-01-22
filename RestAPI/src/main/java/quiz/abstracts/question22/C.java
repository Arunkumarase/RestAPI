package quiz.abstracts.question22;

class C extends B
{
    @Override
    void methodTwo()
    {
        System.out.println(i);
        System.out.println(j);
        i = i++;
        j = j--;
    }
}