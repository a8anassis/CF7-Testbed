package gr.aueb.cf.ch6;

/**
 * Copies an array. Actually what is copied
 * is not the values but the reference.
 * When we copy references, it is always a shallow copy.
 * And there are side effects.
 */
public class Array7ShallowCopy8 {

    public static void main(String[] args) {

        int[] initialArray = {1, 2, 3, 4, 5};
        int[] arrayCopy = initialArray;         // Reference copy is Shallow Copy

        arrayCopy[0] = 100;

        // Side Effects
        for (int val : initialArray) {
            System.out.print(val + " ");
        }
    }
}
