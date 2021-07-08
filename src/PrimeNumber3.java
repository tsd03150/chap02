// PrimeNumber2를 한번 더 개선한 프로그램

public class PrimeNumber3 {

    public static void main(String[] args) {

        int[] ptr = new int[500];
        int count = 0;
        int divCount = 0;

        ptr[count++] = 2;
        ptr[count++] = 3;

        for (int n = 5; n <= 1000; n += 2) {
            int i = 0;
            boolean isFrag = false;

            for (i = 1; ptr[i] * ptr[i] <= n; i++) {
                divCount+=2; // 곱하기 하고 나눔으로 기회 비용 2씩 증가

                if (n % ptr[i] == 0) {
                    isFrag = true;
                    break;
                }
            }

            if (!isFrag) {
                divCount++;
                ptr[count++] = n;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(ptr[i]);
        }

        System.out.println("나눗셈은 총 " + divCount + "번 했습니다.");




    }
}
