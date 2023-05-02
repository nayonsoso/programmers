// 나영서
// 놀이동산 입장권 계산 프로그램

package Mini.Q3;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = scanner.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = scanner.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String army = scanner.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String bokzi = scanner.next();

        int price = 10000;
        if (age < 3) {
            price = 0;
        } else if (age < 13) {
            price = 4000;
        } else if (time >= 17) {
            price = 4000;
        } else if (army.equals("y") || bokzi.equals("y")) {
            price = 8000;
        }

        System.out.println("입장료:" + price);

    }
}
