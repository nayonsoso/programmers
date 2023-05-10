package OnboardingMission.M3Bonus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PG12910 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] answer = solution(arr, 5);
        Arrays.stream(answer).forEach(System.out::println);
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answerList.add(arr[i]);
            }
        }

        Collections.sort(answerList);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return (answer.length != 0) ? answer : new int[] {-1} ;
    }
}
