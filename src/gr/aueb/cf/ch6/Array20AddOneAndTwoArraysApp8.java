package gr.aueb.cf.ch6;

public class Array20AddOneAndTwoArraysApp8 {

    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        int[] result = addOne(arr);

        for (int num : result) {
            System.out.print(num);
        }
    }

    /**
     * Προσθέτει τη μονάδα σε ένα πίνακα που
     * αναπαριστά ένα ακέραιο.
     * @param arr   ο input πίνακας.
     * @return      ένα νέο array που περιέχει το
     *              αποτέλεσμα.
     */
    public static int[] addOne(int[] arr) {
        if (arr == null) return null;
        int[] arrOut = new int[arr.length + 1];
        int carry = 1;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }
        arrOut[0] = carry;
        return arrOut;
    }


    /**
     * Προσθέτει δύο ακεραίους οσοδήποτε μεγάλους.
     * Οι ακέραιοι αναπαρίστανται ως arrays.
     * @param arr1  ο 1ος array.
     * @param arr2  ο 2ος array.
     * @return      το αποτέλεσμα που είναι ένα νέος πίνακας.
     */
    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return new int[0];
        if (arr1.length != arr2.length) return new int[0];

        int carry = 0;
        int sum = 0;
        int[] arrOut = new int[arr1.length + 1];

        for (int i = arr1.length - 1; i >= 0; i--) {
            sum = arr1[i] + arr2[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }
}
