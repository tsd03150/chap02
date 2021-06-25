// 실습 2-8
// 진수 변환 프로그램

import java.util.Arrays;
import java.util.Scanner;

public class InsuTransform {

    static char[] transform(int num, int r, char[] arr) {
        String str = "0123456789ABCDEF";
        int i = 0;
        int j = 0;

        System.out.printf(r + "|" +"%6d",num);
        System.out.println();
        System.out.println(" +------");

        while (num != 0) {
            arr[i++] = str.charAt(num % r);
            num/=r;

            if (num == 0) {
                System.out.printf("%8d"+" ...... "+arr[j++],num);
                break;
            }


            System.out.printf(r + "|" +"%6d"+" ...... "+arr[j++],num);
            System.out.println();
            System.out.println(" +------");
        }

        char[] changeArr = reverseArr(arr);
        return changeArr;
    }

    static char[] reverseArr(char[] arr) {
        char tmp = ' ';

        for (int i = 0; i < arr.length/2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;

        }
        return arr;
    }


    public static void main(String[] args) {
        boolean con = true;

        do {

            Scanner stdIn = new Scanner(System.in);

            System.out.println("10진수를 기수 변환합니다");
            System.out.print("변환하는 음이 아닌 정수 : ");
            int num = stdIn.nextInt();
            System.out.print("어떤 진수로 변환할까요? : ");
            int r = stdIn.nextInt();

            char[] arr = new char[10];
            char[] transform = transform(num, r, arr);

            String str = "";

            for (int i = 0; i < transform.length; i++) {
                if (transform[i] != '\u0000') {
                    str += transform[i];
                }
            }

            System.out.println();
            System.out.println(r + "진수로 " + str + "입니다.");

            System.out.print("계속하시겠습니까? y/n >> ");
            String next = stdIn.next();

            if (next.equals("n")) {
                break;
            }

        } while (con);

    }


}