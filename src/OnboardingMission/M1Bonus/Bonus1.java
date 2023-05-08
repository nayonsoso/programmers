package OnboardingMission.M1Bonus;

import java.util.Scanner;
import java.util.Stack;

public class Bonus1 {
    public static void main(String[] args) {
        // 초기 설정
        Scanner scanner = new Scanner(System.in);
        int arrNum = scanner.nextInt();
        int[] arr = new int[arrNum];
        for (int i = 0; i < arrNum; i++) {
            arr[i] = scanner.nextInt();
        }

        String[] srr = {"1", "2"};
        System.out.println(srr);

        Stack[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack();
            stacks[i].push(0);
        }

        for (int i = 0; i < arrNum; i++) {
            int min = arr[i];
            int minStack = -1;
            for (int s = 0; s < 4; s++) {
                if ((int) stacks[s].peek() < arr[i]) {
                    min = (int) stacks[s].peek();
                    minStack = s;
                }
            }
            if (minStack == -1) { // 모든 peek이 더 큰 경우
                System.out.print("NO");
                break;
            } else {
                stacks[minStack].push(arr[i]);
                if (i == arrNum - 1) {
                    System.out.print("YES");
                }
            }
        }

    }
}
