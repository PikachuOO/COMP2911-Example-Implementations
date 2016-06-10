public class SetComparisonTestingSuite implements SetTestingSuite {
    private Set<Integer> s;
    
    public SetComparisonTestingSuite (Set<Integer> s) {
        this.s = s;
    }

    @Override
    public void test(Set<Integer> setToBeComparedTo, int size, boolean shouldBeEmpty, int intersectionCount) {
        int interCounter = 0; 
        boolean success = true;
        for (Integer i : this.s) {
            if (setToBeComparedTo.contains(i)) {
                interCounter++;
            }
        }

        if (this.s.size() != size) {
            System.out.format("FAILED - Set size != %d!\n", size);
            success = false;
        }

        if (setToBeComparedTo.isEmpty() != shouldBeEmpty) {
            System.out.format("FAILED - Set reported as %s!\n", Boolean.toString(!shouldBeEmpty));
            success = false;
        }

        if (interCounter != intersectionCount) {
            System.out.format("FAILED - Set intersection counter is not %d! (Actual value: %d)\n", intersectionCount, interCounter);
            success = false;
        }


        // finally
        if (success) {
            System.out.format("OK\n");
        }
    }
}
