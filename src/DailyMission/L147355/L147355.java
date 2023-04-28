package DailyMission.L147355;

public class L147355 {
    public static void main(String args[]){
        System.out.println(Solution.solution("3141592","271"));
    }

}

class Solution {
    public static int solution(String t, String p) {
        long p_int = Long.parseLong(p);
        int answer = 0;
        long target = 0;

        for(int i = 0; i <= t.length() - p.length(); i++){
            for(int j = 0; j < p.length(); j++){
                long any = t.charAt(i+j) - '0';
                target += any * Math.pow(10, p.length() -1 -j);
            }
            if(target <= p_int) {
                answer++;
            }
            target = 0;
        }
        return answer;
    }
}