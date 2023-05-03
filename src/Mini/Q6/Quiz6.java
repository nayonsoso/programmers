// 나영서
// 대선 시뮬레이션

package Mini.Q6;

import java.util.*;

public class Quiz6 {
    public static void main(String[] args) {
        Map<String, String> candidates = new HashMap<>();
        candidates.put("1", "이재명");
        candidates.put("2", "윤석열");
        candidates.put("3", "심상정");
        candidates.put("4", "안철수");
        doVote(candidates,4);
    }

    static void doVote(Map<String,String> candidate, int times){
        Random random = new Random();
        // 총 투표수, 퍼센테이지
        double p_total;
        int n_total = 0;
        // 각 후보별 투표수, 퍼센테이지
        int[] n_array = new int[candidate.size()];
        double[] p_array = new double[candidate.size()];
        // 후보 기호를 관리할 배열 - 이게 있어야 random으로 기호 추출 가능
        String[] candidate_num = new String[candidate.size()];
        Set<Map.Entry<String, String>> entries = candidate.entrySet();
        int ii = 0;
        for( Map.Entry<String, String> elem : entries){
            candidate_num[ii] = elem.getKey();
            ii++;
        }
        int vote;

        for (int i = 0; i < times; i++) {
            vote = random.nextInt(candidate.size());
            n_total++;
            p_total = n_total / (double) times * 100;
            n_array[vote] = n_array[vote] + 1;
            p_array[vote] = n_array[vote]/ (double) times * 100;
            String answer = String.format("[투표진행률]: %05.2f%%, %d명 투표 => %s\n",
                    p_total, n_total, candidate.get(candidate_num[vote]));
            int idx = 0;
            for( Map.Entry<String, String> elem : entries){
                answer += String.format("[기호:%s] %s: %05.2f%%, (투표수: %d)\n",elem.getKey(), elem.getValue(), p_array[idx],n_array[idx]);
                idx++;
            }
            System.out.println(answer);
        }

        List<Integer> n_list = new ArrayList<>();
        int max = 0;
        int max_idx = 0;
        for (int i = 0; i < n_array.length; i++) {
            n_list.add(n_array[i]);
            if (n_array[i] > max) {
                max = n_array[i];
                max_idx = i;
            }
        }
        int freq = Collections.frequency(n_list,max);

        if(freq!=1){
            System.out.println("동표가 발생했습니다. 동표는 " + max + "입니다.");
            System.out.println("동표가 발생항 후보들은 "+ freq+"명 입니다.\n");
            Map<String, String> candidate2 = new HashMap<>();
            int idx2 = 0;
            for( Map.Entry<String, String> elem : entries ){
                if(n_array[idx2]==max){
                    candidate2.put(elem.getKey(), elem.getValue());
                }
                idx2++;
            }
            doVote(candidate2, max*freq);
        } else {
            System.out.println("[투표결과] 당선인: " + candidate.get(Integer.toString(max_idx+1)));
        }
    }
}

