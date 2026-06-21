package gfg.arrays.moveallzeroestoend;

import java.util.Arrays;

class MoveAllZeroesToEnd {

    static void pushZerosToEnd(int[] arr) {
        int p = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
                p++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }
}

