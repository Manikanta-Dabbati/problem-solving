package gfg.arrays.rotatearray;

import java.util.Arrays;

class RotateArray {

    static void rotateArr(int[] arr, int d) {
        d %= arr.length;

        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
    }

    static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        rotateArr(arr, d);

        System.out.println(Arrays.toString(arr));
    }
}

