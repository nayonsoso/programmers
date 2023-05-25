package PreCodingTest.week2Hint.BJ11725_2;

import java.io.*;
import java.util.*;

public class Hint {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,Integer> tree = new HashMap<>();
        tree.put(1,0); // (자식, 부모)
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int iter = Integer.parseInt(bf.readLine());
        for (int i = 0; i < iter -1 ; i++) {
            String[] ab = bf.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            if(tree.keySet().contains(a)){ // a가 부모
                tree.put(b,a);
            } else{ // b가 부모
                tree.put(a,b);
            }
        }

        LinkedList<Integer> ll = new LinkedList(tree.keySet());
        Collections.sort(ll);
        for(int i : ll){
            if(i==1){continue;}
            System.out.println(tree.get(i));

        }
    }
}
