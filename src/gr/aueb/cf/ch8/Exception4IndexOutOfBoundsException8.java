package gr.aueb.cf.ch8;

public class Exception4IndexOutOfBoundsException8 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
