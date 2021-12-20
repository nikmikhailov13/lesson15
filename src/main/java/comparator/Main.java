package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Student student1 = new Student(20, "Maxim");
    Student student2 = new Student(25, "Playboy");
    Student student3 = new Student(17, "Men'sHealth");

    List<Student> studentList = new ArrayList<>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);

    Collections.sort(studentList);
    studentList.forEach(element -> System.out.println(element));

    System.out.println("----------");

    Collections.sort(studentList, new AgeComparator());
    studentList.forEach(element -> System.out.println(element));

    System.out.println("----------");

    Collections.sort(studentList, new NameComparator());
    studentList.forEach(element -> System.out.println(element));

    System.out.println("----------");

    Collections.sort(studentList, (s1, s2) -> -s1.getName().compareTo(s2.getName()));
    studentList.forEach(System.out::println);

  }
}
