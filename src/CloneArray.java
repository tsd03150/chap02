// 실습 2-3

public class CloneArray {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] b = a.clone();

        b[3] = 41;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]"+" = "+a[i]);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < a.length; i++) {
            System.out.println("b["+i+"]"+" = "+b[i]);
        }
    }

}
