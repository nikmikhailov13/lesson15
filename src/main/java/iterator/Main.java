package iterator;

import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Integer> integersList = List.of(1, 2, 3, 4);

    Iterator<Integer> iterator = integersList.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (Integer integer : integersList) {
      System.out.println(integer);
    }

    for (Integer integer : new Range(1, 100)) {
      System.out.println(integer);
    }

    for (Integer integer : new RangeWithStep(1, 10, 2)) {
      System.out.println(integer);
    }
  }
}
