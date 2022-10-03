package gb;

import java.util.Iterator;
import java.util.Random;

public class IntegerIterator implements Iterable<Integer>{
    private int number;

    public IntegerIterator(int num){
        this.number = num;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return (count<number);
            }

            @Override
            public Object next() {
                Random rnd = new Random();
                int n = rnd.nextInt(100);
                count++;
                return n;
            }
        };
    }
    public static void main(String[] args) {
        IntegerIterator iterator = new IntegerIterator(5);
        for (Integer i:iterator) {
            System.out.println(i);
        }
    }
}
