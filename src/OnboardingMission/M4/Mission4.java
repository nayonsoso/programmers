package OnboardingMission.M4;

import java.util.Arrays;
import java.util.HashMap;

public class Mission4 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("hello"));
    }
}

class Solution {
    public static String solution(String s) {

        char[] charArr = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : charArr){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(char k : hm.keySet()){
            if(hm.get(k)==1){
                sb.append(k);
            }
        }
        char[] aswArr = sb.toString().toCharArray();
        Arrays.sort(aswArr);
        String answer = "";
        return String.valueOf(aswArr);
    }
}