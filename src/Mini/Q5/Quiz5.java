// 나영서
// 달력 출력 프로그램

package Mini.Q5;

import java.time.LocalDate;
import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요(yyyy):");
        int year = scanner.nextInt();
        System.out.print("달력의 월을 입력해 주세요(mm):");
        int month = scanner.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        int lengthOfMonth = firstDay.lengthOfMonth();
        int dayOfWeek = firstDay.getDayOfWeek().getValue();

        // 출력
        System.out.printf("[%d년 %02d월]\n", year, month);
        System.out.println(" 일  월  화  수  목  금  토");
        String start = "";
        for (int i = 0; i < dayOfWeek; i++) {
            if (dayOfWeek == 7) {
                break;
            }
            start += "    ";
        }
        for (int i = 1; i <= lengthOfMonth; i++) {
            start += String.format("%02d  ", i);
            if (i % 7 == (7 - dayOfWeek)) {
                start += "\n";
            }
        }
        System.out.println(start);
    }
}

