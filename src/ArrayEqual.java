// 실습 2-7
// 두 배열을 비교


import java.util.Scanner;

public class ArrayEqual {

    static boolean equalsArray(int[] arrA, int[] arrB) {

//        // 내가 짠 코드
//        boolean same = false;
//
//        if (arrA.length == arrB.length) {
//            for (int i = 0; i < arrA.length; i++) {
//                if (arrA[i] == arrB[i]) {
//                    same = true;
//                }
//                else {
//                    return false;
//                }
//            }
//
//        } else {
//            return false;
//        }
//
//        return same;

        if (!(arrA.length == arrB.length)) {
            return false;
        }

        for (int i = 0; i < arrA.length; i++) {
            if (!(arrA[i] == arrB[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요소 수 : ");
        int numA = stdIn.nextInt();

        int[] arrA = new int[numA];

        for (int i = 0; i < numA; i++) {
            System.out.print("a["+i+"]"+" : ");
            arrA[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요소 수 : ");
        int numB = stdIn.nextInt();

        int[] arrB = new int[numB];

        for (int i = 0; i < numB; i++) {
            System.out.print("b["+i+"]"+" : ");
            arrB[i] = stdIn.nextInt();
        }

        if (equalsArray(arrA, arrB)) {
            System.out.println("배열 A와 배열 B는 같습니다.");
        } else {
            System.out.println("배열 A와 배열 B는 다릅니다.");
        }



    }
}
