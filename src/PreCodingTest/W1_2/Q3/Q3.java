package PreCodingTest.W1_2.Q3;

public class Q3 {
}

// gcd 까먹어서 처음부터 다시 구함
class Solution {
    public int solution(int[] A) {
        // A에는 임의의 정수 N개가 들어있다.
        // N개의 모든 숫자를 아우르는 최대 공약수를 구하는 프로그램은?
        // 두 수의 최대공약수 : gcd
        int answer = 0;
        // System.out.print(gcd(532, 462));

        for(int i=0; i<A.length ; i++){
            answer = gcd(A[i],answer);
        }
        return answer;
    }

    int gcd(int a, int b){
        if(b==0){return a;}
        if(b==1){return 1;}
        return gcd(b, a%b);
    }
}