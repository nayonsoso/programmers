// 나영서
// 대선 시뮬레이션

package Mini.Q6;

import java.util.*;

public class Quiz6 {
    public static void main(String[] args) {
        // LinkedHashMap은 삽입한 순서 그대로 HashMap을 유지시켜준다.
        LinkedHashMap<String, String> candidates = new LinkedHashMap<>();
        candidates.put("1", "이재명");
        candidates.put("2", "윤석열");
        candidates.put("3", "심상정");
        candidates.put("4", "안철수");
        doVote(candidates,10);
    }

    static void doVote(Map<String,String> candidate, int times){
        Random random = new Random();
        // 총 투표수, 퍼센테이지
        int n_total = 0;
        double p_total;
        // 각 후보별 투표수, 퍼센테이지
        int[] n_array = new int[candidate.size()];
        double[] p_array = new double[candidate.size()];
        // 후보 기호를 관리할 배열 - 이게 있어야 재귀로 호출될 때 random으로 기호 추출 가능
        String[] candidate_num = new String[candidate.size()];
        int ii = 0;
        for( String key : candidate.keySet()){
            candidate_num[ii++] = key;
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
            for( String key : candidate.keySet()){
                answer += String.format("[기호:%s] %s: %05.2f%%, (투표수: %d)\n",key, candidate.get(key), p_array[idx],n_array[idx]);
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
            LinkedHashMap<String, String> candidate2 = new LinkedHashMap<>();
            int idx2 = 0;
            for( String key : candidate.keySet() ){
                if(n_array[idx2]==max){
                    candidate2.put(key, candidate.get(key));
                }
                idx2++;
            }
            doVote(candidate2, max*freq);
        } else {
            System.out.println("[투표결과] 당선인: " + candidate.get(candidate_num[max_idx]));
            // candidate.get(String.valueOf(max_idx+1))은 null이 나오는 이유?
            // max_idx의 기준은 새롭게 만든 n_array가 기준이다.
            // n_array는 후보별 투표 수
            // 거기서 가장 많은 인덱스인 max_idx를 candidate와 직접 연결지으면 안된다.
            // e.g. 0 - 윤석열 / 1 - 심상정인데 이재명이 득표한 경우, max_idx = 0이므로,
            // max_idx + 1 = 1에 해당하는 값은 candidate에 없으므로 null이 나온다.
        }
    }
}

