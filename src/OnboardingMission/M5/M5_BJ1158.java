package OnboardingMission.M5;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_BJ1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 총 인원 수
        int K = scanner.nextInt(); // 제거할 순번

        // 링크드 리스트 생성과 삽입
        LinkedList ll = new LinkedList();
        for (int i = 1; i <= N; i++) {
            if (i == N && i !=1) {
                ll.addLastData(i);
            } else {
                ll.addData(i);
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();

        Node deletedNode = ll.removeData(ll.head, K);
        answer.add(deletedNode.data);

        while (ll.size != 0) {
            deletedNode = ll.removeData(deletedNode.next, K);
            answer.add(deletedNode.data);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");
        for(int i =0; i<N;i++){
            sb.append(answer.get(i));
            if(i==N-1){
                break;
            }
            sb.append(", ");
        }
        sb.append(">");
        System.out.print(sb);
    }
}


class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // 삽입하는 연산
    void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
        size++;
    }

    void addLastData(int data) {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(data, head);
        size++;
    }

    Node removeData(Node startNode, int K) {
        if (this.size == 1) {
            size--;
            return startNode;
        }

        // 사용할 두개의 노드 선언
        Node cur = startNode;
        Node before = new Node(0, null);

        for (int i = 0; i < K - 1; i++) {
            if (i == K - 2) {
                before = new Node(cur.data, cur.next); // 삭제하기 직전 노드의 값 저장
                cur.next = cur.next.next; // 삭제 직전 노드의 next가 삭제할 노드의 next를 가리키게
            } else {
                cur = cur.next;
            }
        }

        if(K==1){
            before = new Node(cur.data, cur.next); // 현재 노드의 값 저장 (현재 노드는 next를 바꿀 것이므로 저장해둬야 함)
            cur.next = cur.next.next; // 현재 노드의 next가 다음 노드의 next를 가리키게
            size--;
            return before;
        }

        size--;
        return before.next;
    }
}