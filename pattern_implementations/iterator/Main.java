import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main (String[] args) {
        // Iterator evenNumberInterator = new EvenIterator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // adding large amount of numbers
        for (int x = 0; x < 10; x++) {
            numbers.add(x);
            System.out.println("added: " + Integer.toString(x));
        }

        for (Integer y : numbers) {
            System.out.println("accessing: " + Integer.toString(y));
        }
    }
}
