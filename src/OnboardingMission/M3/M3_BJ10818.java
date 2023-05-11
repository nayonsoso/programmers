package OnboardingMission.M3;

import java.util.Scanner;

public class M3_BJ10818 {
    public static void main(String[] args) {
        // 조건에 맞게 입력받기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int min = 0;
        int max = 0;
        for(int i = 0; i<N; i++){
            arr[i] = scanner.nextInt();
            if(i==0){
                min = arr[i];
                max = arr[i];
            } else if (arr[i] < min){
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
