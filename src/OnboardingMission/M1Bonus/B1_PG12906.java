// 연속된 숫자를 제거하는 문제
// 프로그래머스 12906

package OnboardingMission.M1Bonus;

import java.util.Arrays;
import java.util.Stack;

public class B1_PG12906 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,1,3,3,0,1,1};

        // 연속되지 않아야 push
        for(int i: arr){
            if(stack.size() == 0 || stack.peek()!=i){
                stack.push(i);
            }
        }

        // answer에 stack 넣기
        int size = stack.size();
        int[] answer = new int[stack.size()];
        for(int i = size-1; i>=0; i--){
            answer[i] = stack.pop();
        }

        Integer[] asw = stack.toArray(new Integer[stack.size()]);

        System.out.println();
        Arrays.stream(asw).forEach(System.out::print);
    }
}
