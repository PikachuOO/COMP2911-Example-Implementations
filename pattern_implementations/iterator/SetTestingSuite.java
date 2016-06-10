public interface SetTestingSuite {
    void test(Set<Integer> setToBeComparedTo, int size, boolean shouldBeEmpty, int intersectionCount);
}
