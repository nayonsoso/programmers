// 나영서
// 결제 금액 캐시백 계산 프로그램

package Mini.Q2;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.println("결제 금액을 입력해 주세요.(금액):");

        // 결제 금액 입력
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();

        // 캐시백 계산
        int cashBack = (int)Math.floor((cost * 0.1) * 0.01)*100;
        cashBack = (cashBack >= 300) ? 300 : cashBack;
        // cashBack = Math.min(300, cashBack); 도 가등

        // 캐시백 계산 후 결과 출력
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.",cost, cashBack);
    }
}
