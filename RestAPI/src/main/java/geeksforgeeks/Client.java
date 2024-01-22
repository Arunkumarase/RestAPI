package geeksforgeeks;

/*public class Client {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2};
        int n = 5;
        int s = 1000;

        System.out.println(Solution.countTriplet(arr,n));
    }
}*/

/*class Main {

    public static void nextProgram() {
        throw new ArithmeticException();
    }
    public static int testExceptionDivide(int a, int b) {
        if(a == 0 || b == 0)
            nextProgram();
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(testExceptionDivide(10, 0));
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error!!");
            //Handle the exception
        }
    }
}*/


public class Client{
    public int methodC()
    {
        int i = 1110;
        i = (++i - --i);

        return i;
    }
    public static void main(String[] args)
    {
        Client s = new Client();

        System.out.println(s.methodC());
    }
}




