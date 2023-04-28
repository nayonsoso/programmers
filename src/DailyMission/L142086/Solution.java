package DailyMission.L142086;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String args[]) {
        int[] answer = solution("foobar");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ",");
        }
    }

    public static int[] solution(String s) {
        String[] s_split = s.split("");
        int[] answer = new int[s.length()];
        // 배열 두개로 행렬처럼 풀이
        /*
        int count = 0;
        int idx = 0;
        int max = 0;
        int[] answer = new int[s.length()];

        for (int i = 0; i < s_split.length; i++) {
            System.out.println("i는" + s_split[i]);
            for (int j = 0; j <= i; j++) {
                System.out.println("j는" + s_split[j]);
                if(i==j && idx == 0){
                    idx = -1;
                } else if(i != j && s_split[i].equals(s_split[j])){
                    max = j;
                    idx = i - max;
                }
            }
            answer[i] = idx;
            idx = 0;
        } */

        // 컬렉션 프레임워크 이용
        List<String> check_in = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            int idx = check_in.indexOf(s_split[i]);
            if( idx == -1 ){ // i번째 글자가 처음보는 글자이면,
                answer[i] = -1;
            } else { // 존재하는 글자이면, 인덱스 + 1을 넣기
                answer[i] = idx + 1;
            }
            check_in.add(0,s_split[i]);
        }

        return answer;
    }
}
