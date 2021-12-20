package generic;

public class Main {

  public static void main(String[] args) {
    Box<String> stringBox = new Box<>("word");
    Box<Integer> integerBox = new Box<>(3);

    System.out.println(integerBox.getValue());
    System.out.println(stringBox.toString());

    String[] array = {"1", "2", "fas"};
    arrayLength(array);

    String word = myReturn("word");
    Integer integer = myReturn(123);

    print("12345");
    print(87);
  }

  public static <T> void arrayLength(T[] array) {
    System.out.println(array.length);
  }

  public static <T> T myReturn(T value) {
    return value;
  }

  public static <T> void print(T value) {
    System.out.println(value);
  }
}
