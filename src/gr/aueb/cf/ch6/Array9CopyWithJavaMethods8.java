package gr.aueb.cf.ch6;

import java.util.Arrays;

public class Array9CopyWithJavaMethods8 {

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5};
        int[] arrayCopy;

        arrayCopy = arrDeepCopy(initialArray);

        for (int el : arrayCopy) {
            System.out.print(el + " ");
        }
    }

    public static int[] arrDeepCopy(int[] sourceArray) {

        //int[] destinationArray = new int[sourceArray.length];

        //System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

        int[] destinationArray;
        destinationArray = Arrays.copyOf(sourceArray, sourceArray.length);
//        destinationArray = Arrays.copyOfRange(sourceArray, 0, sourceArray.length);

        return destinationArray;
    }
}
