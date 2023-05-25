package PreCodingTest.week2Hint.BJ11725_1;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Hint {
    static class Node{
        int data;
        LinkedList<Node> child = new LinkedList<>();
        Node parent;

        Node(int data){
            this.data = data;
        }
    }

    static class Tree{
        LinkedList<Node> tree = new LinkedList<>();
        LinkedList<Integer> nodeData = new LinkedList<>();
        Node root;

        Tree(){
            root = new Node(1);
            root.parent = new Node(0);
            nodeData.add(1);
            tree.add(root);
        }

        Node findNode(int data){
            for(Node node : tree){
                if(node.data == data){
                    return node;
                }
            }
            return null;
        }

        void addNode(int a, int b){
            Node newNode;
            Node parNode;
            if(nodeData.contains(a)){ // a가 부모
                newNode = new Node(b);
                parNode = findNode(a);
            } else { // b가 부모
                newNode = new Node(a);
                parNode = findNode(b);
            }
            newNode.parent = parNode;
            parNode.child.add(newNode);
            tree.add(newNode);
            nodeData.add(newNode.data);
        }

        void printParentfrom2(){
            Collections.sort(nodeData);
            for(int i : nodeData){
                if(i==1){continue;}
                System.out.println(findNode(i).parent.data);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Tree tree = new Tree();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int iter = Integer.parseInt(bf.readLine());
        for (int i = 0; i < iter -1 ; i++) {
            String[] ab = bf.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            tree.addNode(a,b);
        }
        tree.printParentfrom2();
    }
}