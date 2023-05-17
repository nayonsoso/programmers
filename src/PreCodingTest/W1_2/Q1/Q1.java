package PreCodingTest.W1_2.Q1;

public class Q1 {
}
class Solution {
    public String solution(int n, String s, int t) {
        // 규칙 찾기 문제인가?

        // n : 전광판 크기
        // s : 전광판에 노출할 문자
        // t : t초 후에의 기준이 되는 t

        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        int l = charArray.length;

        //t = 15;

        for(int i = 0 ; i <= t ; i++){ /// i는 초와 정확히 일치
            if(i==0){
                for(int j = 0 ; j < n ; j++){
                    sb.append(".");
                }
            } else if (1 <= i%(l+n) && i%(l+n) <= l){
                sb.deleteCharAt(0);
                sb.append(charArray[i%(l+n)-1]);
            } else if (l < i%(l+n)) {
                sb.deleteCharAt(0);
                sb.append(".");
            }
        }
        String answer = sb.toString();
        return answer;
    }
}