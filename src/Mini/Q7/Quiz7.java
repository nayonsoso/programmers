// 나영서
// 로또 당첨 프로그램

package Mini.Q7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]");
        System.out.print("\n로또 개수를 입력해 주세요.(숫자 1~10):");
        int num = scanner.nextInt(); // 구매 수량

        // 구매한 로또 행렬 생성
        int[][] lottery = new int[num][6];
        for(int i =0 ;i<num; i++){
            char character = (char)(65 + i);
            lottery[i] = make_6num();
            System.out.print(character + "\t");
            print_6num(lottery[i]);
            System.out.println();
        }

        // 타겟 로또 생성
        int[] target = make_6num();
        System.out.println("\n[로또 발표]");
        System.out.print("\t");
        print_6num(target);

        // 동일한 숫자 갯수 출력
        System.out.println("\n\n[내 로또 결과]");
        for(int i = 0; i<num; i++){
            char character = (char)(65 + i);
            System.out.print(character + "\t");
            print_6num(lottery[i]);
            int c = count_same_num(target, lottery[i]);
            System.out.print(" => " + c + "개 일치\n");
        }
    }

    static int[] make_6num(){
        int[] arr = new int[6];
        Random rnd = new Random();
        int rnd_num;

        for(int j = 0; j<6 ; j++){
            rnd_num = rnd.nextInt(45) + 1;
            // 이전까지의 로또 번호와 같으면 추출 반복
            for(int i = 0; i<j; i++){
                if(rnd_num == arr[i]){
                    rnd_num = rnd.nextInt(45) + 1;
                    i = 0;
                }
            }
            arr[j] = rnd_num;
        }
        Arrays.sort(arr); // 배열 정렬하는 방법
        return arr;
    }

    static int count_same_num(int[] arr1, int[] arr2){
        int count = 0;
        for(int j = 0; j<6 ; j++){
            for(int i = 0; i<6 ; i++){
                if(arr1[j]==arr2[i]){
                    count++;
                }
            }
        }
        return count;
    }

    static void print_6num(int[] arr){
        for(int i = 0 ; i<6 ; i++){
            System.out.printf("%02d",arr[i]);
            if(i!=5){
                System.out.print(",");
            }
        }
    }
}

