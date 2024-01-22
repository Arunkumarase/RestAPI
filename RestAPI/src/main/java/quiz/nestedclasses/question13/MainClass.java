package quiz.nestedclasses.question13;

public class MainClass {
    public static void main(String[] args)
    {
        ABC abc = new ABC();
        System.out.println(abc.i);
        ABC.XYZ xyz = abc.new XYZ();
        System.out.println(xyz.i);
        ABC.XYZ xyz1 = new ABC().new XYZ();
        System.out.println(xyz1.i);
    }
}
