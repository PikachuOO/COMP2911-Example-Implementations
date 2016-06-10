import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    private static final String CHECK_MARK = "\u2713";
    private static final String CROSS_MARK = "\u274C";
        
    public static void main (String[] args) {
        Set<Integer> numbers = new ArrayListSet<Integer>();
        // adding large amount of numbers
        for (int x = 0; x < 10; x++) {
            numbers.add(x);
            //  System.out.println("added: " + Integer.toString(x) + " - " + CHECK_MARK);
        }

        // for (int y : numbers) {
        //     System.out.println("accessing: " + Integer.toString(y));
        // }

        System.out.format("Testing comparisons...\n");
        testingComparisons(numbers);
    }
    
    private static boolean testingComparisons(Set<Integer> s) {
        Set<Integer> higherNumbers = new ArrayListSet<Integer>();
        int intersectionCounter = 0;
        for (Integer n : s) {
            if (higherNumbers.contains(n)) {
                intersectionCounter++;
            }
        }
        
        for (int x = 5; x < 15; x++) {
            higherNumbers.add(x);
        }

        SetTestingSuite comparingSuite = new SetComparisonTestingSuite(s);
        System.out.format("\t=>Test 1...");
        comparingSuite.test(higherNumbers, 10, false, 5);

        for (Integer outer : s) {
            higherNumbers.add(outer);
        }
        
        System.out.format("\t=>Test 2...");
        comparingSuite.test(higherNumbers, 10, false, 10);

        return true;
    }
}
