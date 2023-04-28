package DailyMission.L131705;

public class Solution {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number));
    }

    public static int solution(int[] number) {
        int answer = 0;
        // 원소가 3개인 순서쌍 - for문 3개로 구현
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // System.out.printf("(%d,%d,%d)\n", i, j, k);
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
