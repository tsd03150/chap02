// 1000 이하의 소수를 구하는 프로그램

public class PrimeNumber1 {

    public static void main(String[] args) {
        int count = 0;

        for (int n = 2; n <= 1000; n++) {
            int i = 0;

            for (i = 2; i < n; i++) {
                ++count;
                if (n % i == 0) {
                    break;
                }
            }

            if (i == n) {
                System.out.println(n);

            }
        }

        System.out.println("나눗셈은 총 " + count + "번 했습니다.");


    }
}
