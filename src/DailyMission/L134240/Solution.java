package DailyMission.L134240;

public class Solution {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        System.out.println(solution(food));
    }

    public static String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                food[i] = food[i] - 1;
            }
            for (int j = 0; j < food[i] / 2; j++) {
                answer += Integer.toString(i);
            }
        }

        int a_length = answer.length();
        String[] asw_split = answer.split("");
        answer += "0";

        for (int i = a_length - 1; i >= 0; i--) {
            answer += asw_split[i];
        }

        return answer;
    }
}
