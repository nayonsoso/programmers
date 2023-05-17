package PreCodingTest.W1_2.Q4;

public class Q4 {
}

class Solution {
    public int solution(int[] orders, int n) {
        // orders : 주문 내역이 담긴 정수 배열
        // n : 찾고다 하는 주문번호의 차례의 정수
        //orders = new int[] {2,4,5,8,10,13};
        //n = 3;

        int answer = 0;
        int i = 1;
        int ii = 0;
        int n_count = 0;

        while(i < orders[orders.length-1]){
            System.out.println("=== i는" + i+"일 때 ===");
            if(i==orders[ii]){
                System.out.println("i와 배열의 ii번째 원소의 값이 일치합니다.\n"
                        + "ii는 " + ii + " ii의 값은 "+ orders[ii]);
                ii++;
            }
            else {
                n_count++;
                System.out.println(i+"는 누락된 " + n_count +"번째 주문입니다.");
                if(n_count == n){
                    answer = i;
                    System.out.println("누락된 "+n_count +"번째 주문은 " + i+"입니다.");
                    break;
                }
            }
            i++;
        }

        if(i >= orders[orders.length-1]){
            while(n_count != n){
                i++;
                n_count++;
            }
            answer = i;
        }
        System.out.println("답은 "+answer);

        return answer;
    }
}