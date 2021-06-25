// 실습 2-6
// num을 입력 받는다
// 입력 받은 num을 토대로 배열을 생성 및 값을 입력
// 배열을 출력
// 배열을 뒤집어서 출력


import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void reverseArr(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {

            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;

            System.out.println("arr["+i+"]"+ "과(와) " + "arr[" + (arr.length - 1 - i) + "]를 교환합니다." );
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static int sumOf(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("양수만 입력해주세요 >> ");
            num = stdIn.nextInt();
        } while (num <= 0);

        int[] arr = new int[num];

        System.out.println("배열의 요소값을 입력해주세요 >> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stdIn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + " = " + arr[i]);
        }

        reverseArr(arr);

        System.out.println("------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + " = " + arr[i]);
        }

        int sum = sumOf(arr);
        System.out.println("이 배열 요소의 합은 " + sum + "입니다.");


    }
}
