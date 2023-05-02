// 나영서
// 주민등록번호 생성 프로그램

package Mini.Q4;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int years = scanner.nextInt();
        String year = Integer.toString(years % 100);
        System.out.println("출생월을 입력해 주세요.(mm):");
        String month = String.format("%02d", scanner.nextInt());
        System.out.println("출생일을 입력해 주세요.(dd):");
        String day = String.format("%02d", scanner.nextInt());
        System.out.println("성별을 입력해 주세요.(m/f):");
        String sex = scanner.next().equals("f") ? "4" : "3";

        int rnd = random.nextInt(999999) + 1;
        String rndString = String.format("%06d", rnd);
        String result = String.format("%s%s%s-%s%s", year, month, day, sex, rndString);
        System.out.println(result);

    }
}
