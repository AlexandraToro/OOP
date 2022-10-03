package gb;

import java.util.Iterator;

public class EvenIterator implements Iterable<Character>{
    private final String str;

    public EvenIterator(String str) {
        this.str = str;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator() {
            private int counter=0;
            @Override
            public boolean hasNext() {
                return counter<str.length();
            }

            @Override
            public Object next() {
                char ch = str.charAt(counter);
                counter+=2;
                return ch;
            }
        };
    }

    public static void main(String[] args) {
        EvenIterator itr= new EvenIterator("1254");
        for (Character ch:itr) {
            System.out.println(ch);
        }

    }
}
