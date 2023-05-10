package OnboardingMission.M4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Mission4 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque();
        deque.offerFirst("a");
        deque.offer("b");
        deque.offer("c");
        deque.offer("d");
    }
}
