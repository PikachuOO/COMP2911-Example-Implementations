public class SetSingleTestingSuite implements SetTestingSuite {
    public SetSingleTestingSuite() {}

    @Override
    public void test(Set<Integer> setToBeComparedTo, int size, boolean shouldBeEmpty, int intersectionCount) {
        boolean success = true;

        if (setToBeComparedTo.size() != size) {
            System.out.format("FAILED - Set size != %d!\n", size);
            success = false;
        }

        if (setToBeComparedTo.isEmpty() != shouldBeEmpty) {
            System.out.format("FAILED - Set reported as %s!\n", Boolean.toString(!shouldBeEmpty));
            success = false;
        }
    }
}
