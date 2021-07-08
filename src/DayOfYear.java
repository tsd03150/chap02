// 해당 년도 몇월 몇일이 그 년도에 몇일이 지났는 지를 알려주는 프로그램


import java.util.Scanner;

public class DayOfYear {

    static int[][] arr = {
            {31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31}
    }; // cv

    static int isLeap(int year) {

        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;
        // 윤년(29일)이면 1
        // 평년(28일)이면 0
    }

    static int isAllDay(int year, int month, int day) {

        int dayAll = day;

        for (int i = 1; i < month; i++) {
            dayAll += arr[isLeap(year)][i-1];
        }

        return dayAll;
    }
    // 12월 1일 -> 30일 남음 12월 31일 - 11월 1일
    // 11 12

    static int leftAllDay(int year, int month, int day) {

        // 해당 월에 남은 일 계산
        int thisDay = arr[isLeap(year)][month-1]; // 31
        int dayLeft = thisDay - day; // 7월 9일 31-9=22+1= 23+31+30+31+30+31=175

        // 남은 월 계산
        for (month = month + 1; month <= 12; month++) {
            dayLeft += arr[isLeap(year)][month-1]; // 31 30 31 30
        }
        return dayLeft;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("***** 해당 연도로부터 며칠이 지났는지 알려주는 프로그램 *****");

            System.out.print("연도를 입력하세요!");
            int year = scanner.nextInt();

            System.out.print("월을 입력하세요!");
            int month = scanner.nextInt();

            System.out.print("일을 입력하세요!");
            int day = scanner.nextInt();

//            int allDay = isAllDay(year, month, day);
//            System.out.println(allDay + "일이 지났습니다.");

            int allDay = leftAllDay(year, month, day);
            System.out.println(allDay + "일이 남았습니다.");

            System.out.println("계속 플레이하시겠습니까? y?n?");
            String next = scanner.next();

            if (next.equals("n")) {
                break;
            }

        } while (true);



    }
}
