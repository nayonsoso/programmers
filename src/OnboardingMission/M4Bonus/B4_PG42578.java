package OnboardingMission.M4Bonus;

import java.util.Hashtable;

public class B4_PG42578 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        // 카테고리마다 빈도 카운트
        Hashtable<String, Integer> hb = new Hashtable<>();
        for(int i = 0; i<clothes.length; i++){
            String category = clothes[i][clothes[i].length-1];
            hb.put(category, hb.getOrDefault(category,0)+1);
            System.out.println("category = " + category);
            System.out.println("count = " + (hb.getOrDefault(category,0)));
            
        }
        int answer = 1;

        for(String c : hb.keySet()){
            System.out.println("c = " + c);
            answer*=(hb.get(c)+1);
        }

        return answer -1 ;
    }
}
