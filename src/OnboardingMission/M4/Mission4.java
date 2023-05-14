package OnboardingMission.M4;

import java.util.HashMap;
import java.util.Scanner;

public class Mission4 {
    public static void main(String[] args) {
        // 형식대로 입력받기
        Scanner scanner = new Scanner(System.in);
        /*
        int N = scanner.nextInt(); // 비밀번호의 길이
        int M = scanner.nextInt(); // 문자의 종류 (0~M-1) 사이
        int A = scanner.nextInt(); // 해시값의 제곱과 mod 연산에 사용됨
        int H = scanner.nextInt(); // 해시값
*/
        int N = 2;
        int M = 87;
        int A = 4;

        HashMap<Integer, Integer> hm = new HashMap<>(); // (mod, 갯수)
        int now_p =0;

        while(now_p != N-1){
            HashMap<Integer,Integer> hm_bonus = new HashMap<>();
            for (int i = 0; i < M; i++) {
                // if(hm.size()<M){hm.put(i,0); continue;}
                int pre_mod_count = hm.getOrDefault(i, 0); // 무슨 mod를 기준으로 작업을 할 것인가
                System.out.println("기준이 되는 mod = " + i);
                System.out.println("그 모드의 count = " + pre_mod_count);
                for (int j = 0; j < M; j++) {
                    int post_mod = (pre_mod_count + j * (int) Math.pow(A, now_p)) % M; // 그것을 기준으로 0~M-1개에 대해 mod를 생성
                    System.out.println("모드:값\t" + post_mod + ":" + (hm_bonus.getOrDefault(post_mod, 0) + 1));
                    hm_bonus.put(post_mod, hm_bonus.getOrDefault(post_mod, 0) + 1);
                }
            }
            for(int key : hm_bonus.keySet()){
                hm.put(key, hm.getOrDefault(key,0)+hm_bonus.getOrDefault(key,0));
            }
            now_p++;

//            System.out.println("중간점검");
//            for (int key : hm.keySet()) {
//                System.out.println("key = " + key + " value = " + hm.get(key));
//            }
        }

        for (int key : hm.keySet()) {
            System.out.println("key = " + key + " value = " + hm.get(key));
        }
    }

    static HashMap<Integer, Integer> loop(int N, int now_p, int M, int A, HashMap<Integer, Integer> hm) {
        /*
        int N = 3; 전체 길이 수
        int M = 2; 문자의 종류 (0~M-1) 사이
        int A = 1; 해시값의 제곱에 사용됨
        */
        return hm;
    }
}