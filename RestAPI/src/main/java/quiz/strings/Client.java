package quiz.strings;

import java.io.Serializable;
import java.util.concurrent.Executor;

public class Client {
    public static void main(String[] args)
    {

        try{
            StringBuffer sb1 = new StringBuffer("11111");
            StringBuffer sb2 = sb1.append(22222).reverse();
            System.out.println(sb1 == sb2);
        }catch (Exception e){
            System.out.println(e);
        }
        /*
        StringBuffer sb1 = new StringBuffer("11111");
        StringBuffer sb2 = sb1.append(22222).reverse();
        System.out.println(sb1 == sb2);
        System.out.println(String.join(",", "1", "2", "3").concat(",").repeat(3).lastIndexOf(','));
        System.out.println(String.valueOf(10)+String.valueOf(1.1)+String.valueOf(true));
        "Java\nConcept\nOf\nThe\nDay".lines().forEach(System.out::println);
        StringBuffer sb = new StringBuffer("One Two Three Four Five");
        System.out.println(sb.reverse().indexOf("Two"));
        String str1 = "OnE tWo ThReE fOuR";
        String str2 = "oNeTwOtHrEeFoUr";
        System.out.println(str1.trim().equalsIgnoreCase(str2));
        StringBuffer sb = new StringBuffer("11111");
        System.out.println(sb.insert(3, false).insert(5, 3.3).insert(7, "One"));
        StringBuffer sb = new StringBuffer("11111");
        System.out.println(sb.insert(3, false).insert(5, 3.3).insert(7, "One"));
        String str1 = "123321123";
        System.out.println(str1.replaceFirst("123", "321").replaceAll("12", "21").substring(3, 6));
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(3, 6).deleteCharAt(4).deleteCharAt(5));
        StringBuffer sb = new StringBuffer("01234");
        sb.append(1.1).append('A').append(22).append(false).append("null");
        System.out.println(sb);
        String str = "    ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        String str = null;
        System.out.println(str.isBlank());
        StringBuilder sb = new StringBuilder(-32);
        sb.append("ABC");
        System.out.println(sb);
        String str = "Java Concept Of The Day";
        System.out.println(str.replace("a", "A").lastIndexOf('a'));
        String str = "JavaConceptOfTheDay";
        System.out.println(str.charAt(str.length()));
        String str = "Java Concept Of The Day";
        System.out.println(str.indexOf('a', 5));
        String str = "Java Concept Of The Day";
        System.out.println(str.indexOf('a') + str.indexOf("Day"));
        String s1 = 1+null+"null";
        System.out.println(s1);
        String s1 = "null"+null+1;
        System.out.println(s1);
        "ABC123abc".chars().forEach(System.out::println);
        String string = "JAVA";
        StringBuffer sbuffer = new StringBuffer(string);
        StringBuilder sBuilder = new StringBuilder(string);
        System.out.println(string.equals(sbuffer));
        System.out.println(string.equals(sBuilder));
        System.out.println(sbuffer.equals(sBuilder));
        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        String[] strings = {"Java", "Python", "JavaScript", "HTML", "CSS"};
        String languages = String.join("_", strings);
        System.out.println(languages);
        System.out.print("0".indent(0));
        System.out.print("1".indent(1));
        System.out.print("2".indent(2));
        System.out.print("3".indent(3));
        System.out.print("4".indent(4));
        System.out.print("5".indent(5));
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2.intern());
        System.out.println(s1.intern() == s2.intern());
        System.out.println(s1.intern() == s2);
        System.out.println("Java"+1000+2000+3000);
        System.out.println(1000+2000+3000+"Java");
        System.out.println(7.7+3.3+"Java"+3.3+7.7);
        System.out.println("ONE"+2+3+4+"FIVE");
        System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(1));
        String s2 = "1";
        System.out.println(s2.concat("2").concat("3"));
        String s1 = "ONE";
        s1.concat("TWO");
        s1.concat("THREE");
        System.out.println(s1);
        String name = "JavaConceptOfTheDay".substring(4);
        System.out.println(name);
        String s = "1".repeat(5);
        System.out.println(s);
        System.out.println("1".concat("2").repeat(5).charAt(7));
        String string = "string".replace('i', '0');
        System.out.println(string.substring(2, 5));
        System.out.println("Java" == new String("Java"));
        String str = "  Java\tConcept\tOf\tThe\tDay     ".strip();
        System.out.println(str);
        System.out.println("string".toUpperCase() == "STRING");
        String str1 = "Java";
        String str2 = str1.intern();
        String str3 = new String("Java");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str1);

        String str1 = "1";
        String str2 = "22";
        String str3 = "333";
        System.out.println(str1.concat(str2).concat(str3).repeat(3));
        System.out.println(str1+","+str2+","+str3);*/
    }
}
