package iterator;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

  private int start;
  private int end;

  public Range(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new RangeIterator(start);
  }

  private class RangeIterator implements Iterator<Integer> {

    private int current;

    public RangeIterator(int current) {
      this.current = current;
    }

    @Override
    public boolean hasNext() {
      if (current > end) {
        return false;
      }
      return true;
    }

    @Override
    public Integer next() {
      Integer result = current;
      current = current + 1;
      return result;
    }
  }
}
