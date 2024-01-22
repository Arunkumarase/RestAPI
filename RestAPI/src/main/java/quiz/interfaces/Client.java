package quiz.interfaces;

interface X
{
    void methodX();

    interface Y
    {
        void methodY();
    }
}

class Z implements X, X.Y
{
    {
        methodX();
        System.out.println(1);
    }
    public void methodX()
    {
        methodY();
        System.out.println(2);
    }
    public void methodY()
    {
        System.out.println(3);
    }
}


public class Client {
    public static void main(String[] args) {
        Z z = new Z();
        System.out.println("---------");
        z.methodX();
        System.out.println("---------");
        z.methodY();
        System.out.println("---------");
        X x = z;
        System.out.println("---------");
        x.methodX();

    }
}


/*

interface A {
    String A = "AAA";
    String methodA();
}
interface B {
    String B = "BBB";
    String methodB();
}

class C implements A, B {

    @Override
    public String methodA() {
        return A+B;
    }

    @Override
    public String methodB() {
        return B+A;
    }
}

class D extends C implements A, B {
    String D = "DDD";

    @Override
    public String methodA() {
        return D+methodB();
    }
}

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.methodA());
        System.out.println(c.methodB());
        D d = new D();
        System.out.println(d.methodA());
        System.out.println(d.methodB());


    }

----------------------------------------------
interface One
{
    int i = 222;
    interface OneTwo
    {
        int i = One.i+One.i;
        interface OneTwoThree
        {
            int i = OneTwo.i + OneTwo.i;
        }
    }
}

-------------------------------------
interface A {
    int methodA();
}
interface B {
    int methodB();
}

interface C {
    int methodC();
}

class D implements A,B,C{
    int i = 999+111;

    @Override
    public int methodA() {
        i =+ i / i;
        return i;
    }

    @Override
    public int methodB() {
        i =- i * i;
        return i;
    }

    @Override
    public int methodC() {
        i = ++i - --i;
        return i;
    }
}


    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.i);
        System.out.println(d.methodA());
        System.out.println(d.methodB());
        System.out.println(d.methodC());
    }

-----------------------------------------
interface X {
    void method();
}

class Y {
    public void method()
    {
        System.out.println("Class Y");
    }
}

class Z extends Y implements X {
}

public static void main(String[] args) {
    X x = new Z();
    x.method();
}

---------------------------------------------
interface One {
    String s ="Final";
    String methodOne();
}
interface Two {
    String methodOne();
}
abstract class Three {
    String s = "Not Final";
    public abstract String methodOne();
}
class Four extends Three implements One, Two {

    @Override
    public String methodOne() {
        String s = super.s + One.s;
        return s;
    }
}
public static void main(String[] args) throws ClassNotFoundException {
        Four four = new Four();
        System.out.println(four.methodOne());

    }
------------------------------------------------
interface A
{
    void methodA();
}

class B {
    public void methodA()
    {
        interface C
        {
            int i = 123;
        }
        System.out.println(C.i);
    }
}
------------------------------------------
interface X {
    char c = 'A';
    char methodX();
}
class Y implements X {
    {
        System.out.println("inside class Y : " + c);
    }

    @Override
    public char methodX() {
        char c = this.c;
        return ++c;
    }
}

    public static void main(String[] args) throws ClassNotFoundException {
        Y y = new Y();
        System.out.println(y.methodX());
        System.out.println(y.c);
        System.out.println(X.c);

    }
--------------------------------------
interface ABC {
    void methodOne();
}
interface PQR extends ABC
{
    void methodTwo();
}
abstract class XYZ implements PQR {
    public void methodOne(){
        methodTwo();
    }
}

class MNO extends XYZ {
    @Override
    public void methodTwo() {
        methodOne();
    }
}

------------------------------------
class P {
    interface Q {
        int i = 111;
    }
}
------------------------------------

class A implements B {
    public int methodB(int i){
        return i =+ i * i;
    }
}
interface B {
    int methodB(int i);
}

-------------------------------------

interface P {
    String p = "PPPP";
    String methodP();
}
interface Q extends P{
    String q = "QQQQ";
    String methodQ();
}

class R implements P,Q{

    @Override
    public String methodP() {
        return q+p;
    }

    @Override
    public String methodQ() {
        return p+q;
    }
}
------------------------------------------

class B {

}
interface A extends B{
// cannot extend interface by a class. Interface extend another interface only not class.

}

interface A {
    int i = 111;
}
class B implements A{
    void methodB(){
        i = 222;     // cannot assign a value to interface property as it is final.
    }
}


interface X {
    void methodX();
}
class Y implements X {
    void methodX()
    {
        System.out.println("Method X");
    }
}


interface A {
    void myMethod();
}
class B {
    public void myMethod(){
        System.out.println("My Method");
    }
}
class C extends B implements A {

}
 */