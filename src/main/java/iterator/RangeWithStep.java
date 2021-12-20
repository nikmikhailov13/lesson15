package iterator;

import java.util.Iterator;

public class RangeWithStep implements Iterable<Integer> {

  private int start;
  private int end;
  private int step;

  public RangeWithStep(int start, int end, int step) {
    this.start = start;
    this.end = end;
    this.step = step;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new RangeWihtStepIterator(start);
  }

  private class RangeWihtStepIterator implements Iterator<Integer> {

    int current;

    public RangeWihtStepIterator(int current) {
      this.current = current;
    }

    @Override
    public boolean hasNext() {
      return current <= end;
    }

    @Override
    public Integer next() {
      Integer result = current;
      current += step;
      return result;
    }
  }
}
