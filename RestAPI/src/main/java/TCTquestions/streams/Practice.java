package TCTquestions.streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        System.out.println("");
        try
        {
            try
            {
                try
                {
                    String s = args[1];
                }
                catch (NullPointerException e)
                {
                    System.out.println(1);
                }
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(2);
            }
        }
        catch (Exception e)
        {
            System.out.println(3);
        }

        /*List<Student> students = new ArrayList<>();
        students.add(new Student("Marcus", 1, "Maths", 95.0));
        students.add(new Student("Dalot", 2, "Tamil", 95.0));
        students.add(new Student("Kobi", 1, "English", 85.0));
        students.add(new Student("Isco", 1, "Maths", 45.0));
        students.add(new Student("Min", 2, "Tamil", 20.0));
        students.add(new Student("Hyu", 1, "English", 99.0));

        List<Student> top3Performers = students
                .stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .collect(Collectors.toList());
        List<String> namePercentage = students
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(namePercentage);

        Map<Boolean, List<Student>> studentsPartitionedByPercentage = students
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));
        System.out.println(studentsPartitionedByPercentage);
        System.out.println(students.stream().anyMatch(Student -> Student.getName() == student1.getName()));
        Student student1 = new Student("Arun", 1, "Maths", 95.0);

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,5,6,2,3,4,5,6,8,9,5));
        List<List<Integer>> listArray = Arrays.asList(
                Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,10,11,12)
        );
        System.out.println(listArray.stream().flatMap(List::stream).collect(Collectors.toUnmodifiableList()));
        System.out.println(array.stream().filter(num -> num > 8).toList());
        System.out.println(array
                .stream()
                .sorted(Comparator.reverseOrder())
                //.limit(6)
                //.distinct()
                //.filter(num -> num > 2)
                //.skip(2)
                .toList()
        );
        System.out.println();
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1,2,3,3,3,3,4,5,6,7,87,8));
        List<Integer> listOfIntegers1 = new ArrayList<>(Arrays.asList(1,6,7,87,8));
        System.out.println(listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2==0)));
        System.out.println(listOfIntegers.stream().distinct().toList());
        System.out.println(listOfIntegers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("Rash", "Macus" , "Kobie", "Bryant"));
        System.out.println(listOfStrings.stream().collect(Collectors.joining("-","Mr.","Suffix")));
        listOfIntegers.stream().filter(i -> i%5 == 0).forEach(System.out::println);
        System.out.println(listOfIntegers.stream().min(Comparator.comparingInt(Integer::intValue)).get());
        System.out.println(listOfIntegers.stream().max(Comparator.comparingInt(Integer::intValue)).get());
        System.out.println(listOfIntegers.stream().filter(listOfIntegers1::contains).collect(Collectors.toList()));
        System.out.println(listOfIntegers.stream().collect(Collectors.averagingInt(Integer::intValue)));
        System.out.println(listOfIntegers.stream().mapToInt(Integer::intValue).sum());*/

    }
}
