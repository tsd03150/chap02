import java.util.Arrays;

public class Teamplay {

    public static void main(String[] args) {

        String[] teamReader = {"팀장1","팀장2","팀장3","팀장4","팀장5"};

        String[] teamOne = {
                "팀원1", "팀원2", "팀원3", "팀원4", "팀원5",
                "팀원6", "팀원7", "팀원8", "팀원9", "팀원10",
                "팀원11", "팀원12", "팀원13", "팀원14", "팀원15",
                "팀원16", "팀원17", "팀원18", "팀원19", "팀원20"};

        String[][] team = new String[5][5];
        int[] count = new int[5];
        int[] count2 = new int[25];

        for (int i = 0; i < teamReader.length; i++) {
            int num = (int) (Math.random() * 5);

            if (count[num]++ == 1) {
                i--;
                count[num]--;
                continue;
            }

            team[i][0] = teamReader[num];

            for (int j = 1; j < teamReader.length; j++) {

                int num2 = (int) (Math.random() * 20);

                if (count2[num2]++ == 1) {
                    j--;
                    count2[num2]--;
                    continue;
                }

                team[i][j] = teamOne[num2];

            }

        }

        for (int i = 0; i < teamReader.length; i++) {
            System.out.print("조장 : ");
            System.out.println(team[i][0]);
            System.out.println(Arrays.toString(team[i]));
        }


    }



}