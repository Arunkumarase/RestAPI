package quiz.nestedclasses.question8;

import com.fasterxml.jackson.databind.ser.Serializers;

public class MainClass {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass(){
            void display() {
                System.out.println("show baseclass");
            }
        };
        baseClass.display();
        //aseClass.show();
    }

}
