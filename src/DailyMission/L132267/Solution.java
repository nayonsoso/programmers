package DailyMission.L132267;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int leftover;
        int receive;
        while(n >= a){
            receive = (n/a)*b;
            leftover = n%a;
            n = receive + leftover;
            answer += receive;
        }
        return answer;
    }
}
