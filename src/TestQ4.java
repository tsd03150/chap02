// 연습문제 2-4

import java.util.Arrays;
import java.util.Scanner;

public class TestQ4 {

    static void copyArr(int[] arrA, int[] arrB) {

        for (int i = 0; i < arrB.length; i++) {
            arrA[i] = arrB[i];
        }

        System.out.println(Arrays.toString(arrA));

    }

    static void rCopyArr(int[] arrA, int[] arrB) {
        for (int i = 0; i < arrB.length; i++) {
            arrA[arrA.length - 1 - i] = arrB[i];
        }

        System.out.println(Arrays.toString(arrA));

    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열의 크기를 정하세요 >> ");
        int num = stdIn.nextInt();

        int[] arrA = new int[num];
        int[] arrB = new int[num];

        for (int i = 0; i < num; i++) {
            arrB[i] = stdIn.nextInt();
        }

        copyArr(arrA, arrB);
        rCopyArr(arrA, arrB);




    }
}
