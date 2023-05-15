package OnboardingMission.M4;

import java.util.Scanner;

public class Mission4 {
    public static void main(String[] args) {
        // 형식대로 입력받기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 비밀번호의 길이
        int M = scanner.nextInt(); // 문자의 종류 (0~M-1) 사이
        int A = scanner.nextInt(); // 해시값의 제곱과 mod 연산에 사용됨
        int H = scanner.nextInt(); // 해시값

        long answer = 1L;
        for(int i = 0; i<N-1; i++){
            answer *= M;
            answer %= 1000000007L;
        }
        System.out.println(answer);

        // 오버플로우 발생
        /*
        long answer = 1L;
        for(int i = 0; i<N-1; i++){
            answer *= M;
        }
        System.out.println(answer%1000000007L);
         */

        // 오버플로우 발생
        // System.out.println((int)Math.pow(M,(N-1)) % 1000000007);
    }
}