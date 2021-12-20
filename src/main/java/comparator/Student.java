package comparator;

public class Student implements Comparable<Student> {

  private final int age;
  private final String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }
  public String getName(){
    return name;
  }

  @Override
  public int compareTo(Student student2) {
    if (this.age == student2.getAge()) {
      return 0;
    } else if ((this.age < student2.getAge())) {
      return -1;
    }
    return 1;
  }

  @Override
  public String toString() {
    return "Student{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}
