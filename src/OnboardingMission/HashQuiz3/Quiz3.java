package OnboardingMission.HashQuiz3;

import java.util.Arrays;
import java.util.HashMap;

public class Quiz3 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        Arrays.stream(solution(name, yearning, photo)).forEach(System.out::println);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 테이블 만들기
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0; i < name.length;i++){
            hm.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        int r = 0;
        for(String[] row : photo){
            for(String n : row){
                answer[r] += hm.getOrDefault(n,0);
            }
            r++;
        }
        return answer;
    }
}
