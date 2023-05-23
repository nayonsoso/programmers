package justTest.compile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        String[] arr = new String[] {"a", "b", "c"};
        // Arrays.asList 사용
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(arr));
        System.out.println(list1);
        // Collections.addAll 사용
        LinkedList<String> list2 = new LinkedList<>();
        Collections.addAll(list2, arr); // 첫번째 매개변수는 비어있는 list형 자료구조
        System.out.println(list2);
         */

        /*
        int i1 = 9;
        char c1 = '9';
        int i2 = c1 - '0';
        char c2 = (char)(i1 + '0');
         */

        /*
        HashMap<String, String> hm = new HashMap<>();
        hm.put("1", "1");
        hm.remove("1");
        // hm.add("1", "1"); // 에러 발생

        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.remove("1");
        // ll.put("1"); // 에러 발생
         */

        HashSet<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        // 생성자 이용
        ArrayList<String> al1 = new ArrayList<>(hs);
        System.out.println(al1);
        // copyOf 이용
        List<String> al2 = List.copyOf(hs);
        ArrayList<String> al3 = new ArrayList<>(al2);
        // ArrayList<String> al3 = List.copyOf(hs); - List를 바로 ArrayList로 만들 수 없으므로 에러 발생
    }
}
