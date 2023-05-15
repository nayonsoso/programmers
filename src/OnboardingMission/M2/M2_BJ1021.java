// 데크(양방향 큐)를 이용해 shift를 하고, 최소한의 shift 연산 수를 구하는 문제

package OnboardingMission.M2;

import java.util.LinkedList;
import java.util.Scanner;

public class M2_BJ1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> deque = new LinkedList<>();

        // 초기 큐의 크기 입력받아서 큐 생성
        int N = scanner.nextInt();
        for(int i = 1; i<= N; i++){
            deque.add(i);
        }

        // 뽑으려는 것의 갯수  & 초기 위치
        int M = scanner.nextInt();
        int[] location = new int[M];
        for (int i = 0; i < M; i++) {
            location[i] = scanner.nextInt();
        }

        // answer : shift가 일어난 횟수를 카운트하는 변수
        int answer = 0;
        for(int i = 0; i<M; i++){
            answer = shift(deque,location[i],answer);
        }
        System.out.println(answer);
    }

    static int shift(LinkedList<Integer> deque, int n, int answer){
        // 데크에서의 idx를 추출 - 하나씩 shift하며 맞는지 조사
        // LinkedList<E> 컬랙션으로 데크를 만들면, idexOf 뿐 아니라 pollFirst 등 Deque의 함수도 사용할 수 있다.
        // LinkedList가 Deque를 implement한 인터페이스이기 때문이다.
        int idx = deque.indexOf(n);

        // 기준(길이 절반을 올림한 것)보다 작거나 같으면 left shit, 기중보다 크면 right shift
        int half_idx = (int)Math.ceil((double)deque.size()/2);
        if (idx <= half_idx) { // 왼쪽으로 shift
            for(int j  = 0; j < idx - 1; j++){
                deque.offerLast(deque.pollFirst());
                answer++;
            }
        } else { // 오른쪽으로 shift
            for(int j  = 0; j < deque.size() - (idx - 1); j++){
                deque.offerFirst(deque.pollLast());
                answer++;
            }
        }
        deque.pollFirst();
        return answer;
    }
}
