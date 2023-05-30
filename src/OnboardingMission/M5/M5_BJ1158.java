package OnboardingMission.M5;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Circle {
    Node head;

    Circle() {
        this.head = null;
    }

    // 삽입하는 연산
    void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data);
        }
    }

    void addLastData(int data) {
        if(this.head == null){ // 처음 추가하는 데이터가 head이자 끝인 경우
            head = new Node(1);
            head.next = head;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data);
            cur.next.next = this.head;
        }
    }

    int removeData(int K) {
        Node cur = this.head;
        int delete = 0;

        // circle의 크기가 1인 경우
        if (cur.next.data == head.data) {
            delete = head.data;
        }

        // K가 1이상인 경우
        for (int i = 0; i < K ; i++) {
            if (i == K - 2) {
                // cur = 지울 노트 이전의 노드
                delete = cur.next.data;
                cur.next = cur.next.next;
                head = cur.next; // 삭제 후 헤드를 변경
            } else {
                cur = cur.next;
            }
        }

        // K가 1인 경우
        if(K==1){
            delete = head.data;
            while (cur.next != head){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            head = cur.next; // 삭제 후 헤드를 변경
        }

        return delete;
    }
}

public class M5_BJ1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 총 인원 수
        int K = scanner.nextInt(); // 제거할 순번

        // 링크드 리스트 생성과 삽입
        Circle ll = new Circle();
        for (int i = 1; i <= N; i++) {
            if(i == N){
                ll.addLastData(i);
            } else {
                ll.addData(i);
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<N; i++) {
            answer.add(ll.removeData(K));
        }
        answer.add(ll.head.data);

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


