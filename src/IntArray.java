// 실습 2-1
// 실습 2-2

public class IntArray {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[4] = 40;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + " = " + arr[i]);
        }

        System.out.println("------------------------------------");

        int[] arr2 = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr[" + i + "]" + " = " + arr2[i]);
        }

    }
}
