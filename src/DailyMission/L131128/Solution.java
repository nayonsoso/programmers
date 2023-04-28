package DailyMission.L131128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String x = "100";
        String y = "1234500";
        System.out.println(solution(x, y));
    }

    public static String solution(String X, String Y) {
        String answer = "";

        String[] X_split = X.split("");
        String[] Y_split = Y.split("");

        List<String> X_list = new ArrayList<>();
        List<String> Y_list = new ArrayList<>();
        List<String> common = new ArrayList<>();

        Collections.addAll(X_list, X_split);
        // split 배열에 있는 것을 다 list로 옮겨담으려 했는데
        // 이렇게 자동완성해줌
        Collections.addAll(Y_list, Y_split);

        // 전체를 돌면서 같은게 있으면 리스트에 넣기
        for(String s : X_list){
            if(Y_list.contains(s)) { // Y_list.indexOf(X_list.get(i)) != -1
                common.add(s);
                Y_list.remove(s);
            }
        }

        if(common.size()==0){return "-1";}

        // 리스트를 역순으로 정렬
        Collections.sort(common, Collections.reverseOrder()); // 새로운 문법 스고이

        if(common.get(0).equals("0")){
            return "0";
        }

        // 리스트에 있는 값을 문자열로 더하기
        for(String s : common){
            answer += s;
        }

        return answer;
    }
}