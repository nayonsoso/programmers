// 연속된 숫자를 제거하는 문제
// 프로그래머스 12906

package OnboardingMission.M2Bonus;

import java.util.Arrays;
import java.util.LinkedList;

public class Bonus2 {
    public static void main(String[] args) {
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1, 1,1,1,1,1};
        Arrays.stream(solution(progresses, speeds)).forEach(System.out::println);
    }

    static int[] solution(int[] progresses, int[] speeds) {
        int rNum = 0;
        LinkedList<Integer> answer = new LinkedList<>();

        for ( int i = 0; i<progresses.length; i++) {
            while(progresses[i]<100){ // 이번이 100보다 작은데
                if(rNum!=0){ // 앞에 누적된게 있다면,
                    answer.add(rNum); // flush해줘야한다.
                    rNum = 0;
                }
                for (int j = i; j < progresses.length; j++) {
                    progresses[j] = progresses[j] + speeds[j];
                }
            }
            // while문 밖 즉, 100 이상이 되면 숫자를 늘려준다.
            rNum++;
            if(i==progresses.length-1){
                answer.add(rNum);
            }
        }

        int[] answerArray = new int[answer.size()];
        for(int i = 0; i<answerArray.length ; i++){
            answerArray[i]= answer.get(i);
        }
        return answerArray;
    }
}
