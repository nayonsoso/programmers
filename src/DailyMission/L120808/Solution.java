package DailyMission.L120808;

public class Solution {
    public static void main(String[] args) {
        for(int i : solution(1,2,3,4)){
            System.out.println(i);
        }
    }
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int denom = lcm(denom1,denom2);
        int numer = numer1*(denom/denom1) + numer2*(denom/denom2);
        if (gcd(numer, denom) != 1){
            answer[0] = numer/gcd(numer, denom);
            answer[1] = denom/gcd(numer, denom);
        } else {
            answer[0] = numer;
            answer[1] = denom;
        }
        return answer;
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}