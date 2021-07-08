// 기존에 PrimeNumber1은 나눗셈을 78022번을 하였다
// 이것을 개선하는 프로그램

// 배열에다가 소수를 담음
public class PrimeNumber2 {

    public static void main(String[] args) {
        int[] ptr = new int[500];
        int count = 0;
        int divCount = 0;

        ptr[count++] = 2;
        // 짝수는 어차피 2를 제외하고는 소수가 아니다
        // 그러면 홀수 중에서 소수를 구해야한다
        // 홀수 x가 있으면 이 x 보다 작은 홀수로 모두 나누는 프로그램 로직 작성
        // 이 때 나눌 수 없는 x는 배열에 담음

        for (int n = 3; n <= 1000; n+=2) {
            int i = 0;

            for (i = 1; i < count; i++) {
                divCount++;

                if (n % ptr[i] == 0) {
                    break;
                }

            }

            if (i == count) {
                ptr[count++] = n;
            }

        }

        for (int i = 0; i < count; i++) {
            System.out.println(ptr[i]);
        }

        System.out.println("나눗셈은 총 " + divCount + "번 했습니다.");


    }
}
