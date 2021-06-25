// 실습 2-4 연습문제 2-1
// 우선 사람의 인원을 입력받는다
// 그 다음 사람의 인원만큼 키를 입력받는다
// 입력 받은 키중에서 최댓값을 출력한다

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {

    static void maxOf(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("키가 가장 큰 사람은 " + max + "입니다.");

    }

    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);

//        int num = 0;
//
//        do {
//            System.out.print("사람의 인원을 입력해주세요 >> ");
//            num = stdIn.nextInt();
//        } while (num <= 0);

//        System.out.println("키를 입력해주세요 >> ");
//
//        int[] arr = new int[num];
//
//        for (int i = 0; i < num; i++) {
//
//            arr[i] = stdIn.nextInt();
//
//        }
//        maxOf(arr);

        Random rand = new Random();

        int num2 = rand.nextInt(10); // 0~9 랜덤
        int[] arr2 = new int[num2];

        for (int i = 0; i < num2; i++) {
            arr2[i] = 100 + rand.nextInt(90); // 0~89 까지의 랜덤 수
        }

        System.out.println(Arrays.toString(arr2));
        maxOf(arr2);




    }
}
