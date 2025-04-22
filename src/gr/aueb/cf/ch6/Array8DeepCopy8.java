package gr.aueb.cf.ch6;

public class Array8DeepCopy8 {

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5};
        int[] arrayCopy;

        arrayCopy = arrDeepCopy(initialArray);
    }

    /**
     * it creates a fresh-copy (deep copy) of an
     * input array.
     *
     * @param sourceArray    the sourceArray array.
     * @return          the copied array.
     */
    public static int[] arrDeepCopy(int[] sourceArray) {

        int[] destinationArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        return destinationArray;
    }
}
