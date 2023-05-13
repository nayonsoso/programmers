package OnboardingMission.LiveSession1;

import java.util.Arrays;
import java.util.HashMap;

public class PG120896 {
    public static void main(String[] args) {

    }

    public String solution(String s){
        HashMap<Character, Integer> sH = new HashMap<>();

        // key로 char 하나, value로 char이 등장하는 빈도를 표시하려 한다.
        for(char x : s.toCharArray()){
            // 키가 키로 등록되어있으면 기존 값 +1, 아니면 그냥 1 저장
            sH.put(x, sH.getOrDefault(x,0)+1);
        }
        StringBuilder sb = new StringBuilder(); // append하기 위해서 StringBuilder를 만든건가?
        for(char key:sH.keySet()){
            if(sH.get(key)==1) sb.append(key);
        }
        String tmp = sb.toString(); // string builder to string
        char[] answer = tmp.toCharArray(); // string to char array
        Arrays.sort(answer); // String을 sort하기 위해서 string builder - String - char array로 바꾼건가?
        return String.valueOf(answer); // 반환할 때는 다시 String으로!
        // StringBuilder클래스와 append 메소드로 스트링을 확장할 수 있음
        // 근데 그게 완성된 String이 아니고, 완성하려면 .toString을 해줘야 함!
    }
}
