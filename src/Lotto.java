import java.util.Arrays;

public class Lotto {

    public static void main(String[] args) {

        int[] numArr = new int[45];
        int[] lotto = new int[6];
        int random = 0;

        for (int i = 0; i < lotto.length; i++) {

            random = (int) (Math.random() * 45 +1); // 1~45 랜덤 수

            if (numArr[random]++ != 0) { // 중복체크
                i--;
                continue;
            }

            lotto[i] = random;
        }

        System.out.println(Arrays.toString(lotto));





    }

}
