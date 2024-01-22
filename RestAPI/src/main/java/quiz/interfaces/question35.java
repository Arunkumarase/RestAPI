package quiz.interfaces;

interface I
{
    class C implements I
    {
        public void methodI(int i)
        {
            System.out.println(i);
        }
    }

    void methodI(int i);
}
public class question35 {
    public static void main(String[] args) {
        I.C c = new I.C();
        c.methodI(5);
    }
}
