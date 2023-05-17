package PreCodingTest.W1_2.Q2;

import java.util.LinkedList;

public class Q2 {
}

// 야발 어떻게 풀고 있는거야..
class Solution {
    public String[] solution(String s) {
        LinkedList<String> list = new LinkedList<String>();
        //s = "abc, sss  dasf,asdkhfaw!!fdg ";

        char[] charArray = s.toCharArray();
        int l = charArray.length;

        int check = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<l ; i++){
            if(check == -1){
                sb = new StringBuilder();
                check = 0;
            }
            switch(charArray[i]){
                case ',':
                case '!':
                case '?':
                case '.':
                case ' ': check = -1;
                    if(sb.length()==0){continue;}
                    list.add(sb.reverse().toString());
                default :
                    sb.append(charArray[i]);
                    if(i==l-1 && check!=-1){
                        list.add(sb.reverse().toString());
                    }
            }
        }

        //String[] sArray = s.split(",||!");
        //Arrays.stream(sArray).forEach(System.out::println);
        //list.stream().forEach(System.out::println);

        String[] answer = new String[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}