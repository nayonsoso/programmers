// 스택 4개를 이용해서 정렬이 가능한지 확인하는 문제
// 백준 25556

package OnboardingMission.M1;

import java.util.Scanner;
import java.util.Stack;

public class M1_BJ25556 {
    public static void main(String[] args) {
        // 초기 설정 : 입력받고 4개의 stack을 만듦
        Scanner scanner = new Scanner(System.in);
        int arrNum = scanner.nextInt();
        int[] arr = new int[arrNum];
        for (int i = 0; i < arrNum; i++) {
            arr[i] = scanner.nextInt();
        }

        // 스택의 top을 0으로 초기화
        Stack[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack();
            stacks[i].push(0);
        }

        for (int i = 0; i < arrNum; i++) {
            // 삽입 조건 : 입력보다 작은 top 중에 가장 큰 top이 있는 stack에 삽입
            int input = arr[i];
            int max_top = 0;
            int minStackNum = -1;
            // 4개의 스택을 돌면서 입력보다 now_top이 작으면서 max_top보다 크면 max_top을 갱신
            for (int s = 0; s < 4; s++) {
                int now_top = (int) stacks[s].peek();
                if ( now_top < input && max_top <= now_top) {
                    max_top = now_top;
                    minStackNum = s;
                }
            }
            // 모든 top이 입력보다 더 큰 경우 minStackNum이 갱신되지 않음
            if (minStackNum == -1) {
                System.out.print("NO");
                break;
            } else {
                stacks[minStackNum].push(input);
                if (i == arrNum - 1) {
                    System.out.print("YES");
                }
            }
        }
    }
}

