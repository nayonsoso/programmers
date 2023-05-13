package OnboardingMission.HashQuiz2;

import java.util.HashMap;
import java.util.LinkedList;

public class Quiz2 {
    public static void main(String[] args) {
        System.out.println("1 :" +Solution.solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println("2 :" +Solution.solution(new int[]{1, 1, 2, 2}));
    }
}

class Solution {
    public static int solution(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int i : array) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            if(max<hm.getOrDefault(i,0)){
                max = hm.get(i);
            }
        }

        LinkedList<Integer> list = new LinkedList<>();
        for(int i:hm.keySet()){
            if(hm.get(i)==max){
                list.add(i);
            }
        }
        return list.size( ) >1 ? -1 : list.get(0);
    }
}