package gb;

import java.util.Iterator;

public class IterableIterator implements Iterable{

    private final int start;
    private final int end;

    public IterableIterator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int counter = start;
            @Override
            public boolean hasNext() {
                return counter<=end;
            }

            @Override
            public Object next() {
                return counter++;
            }
        };
    }

    public static void main(String[] args) {
        IterableIterator iterator = new IterableIterator(2,10);
        for (Object integer:iterator) {
            System.out.println(integer);
        }
    }
}
