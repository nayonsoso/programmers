package PreCodingTest.W1_2.Q5;

public class Q5 {
}
class Solution {
    public int solution(int[] arr) {
        // 0에 가장 가까운 값을 구하라
        int min = (arr[0]<0) ? arr[0]*-1 : arr[0];
        for(int num: arr){
            if(num<0){
                num *= -1;
                if(min>num){
                    min = num;
                }
            }
            if(min>num){
                min = num;
            }
        }
        int answer = min;
        return answer;
    }
}