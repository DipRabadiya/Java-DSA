package LinkedList.SinglyLinkedList;

import java.util.HashSet;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(20);
        ll.insert(3);
        ll.insert(4);
        ll.insert(4);
        ll.insert(6);

        ll.update(6,5);
        ll.delete(20);
        ll.RemoveDuplicate();
        ll.print();
        ll.printReverse(ll.head);
        ll.countNode();
        ll.length();
        ll.find(2);
        ll.getNNode(3);
        ll.getEndNode(4);
        ll.head = ll.reverseRecursive(ll.head);
        ll.print();
        ll.ReverseLinkedlist();
        ll.print();
        System.out.println(ll.hasCycle());
        ll.findMiddle();
        System.out.println(ll.isPalindrome(ll.head));
    }
}
class LL{
    Node head;
    Node tail;
    int totalNode = 0;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void printReverse(Node head){
        if(head == null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data + "->");
    }

    public void update(int old, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == old) {
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    public void delete(int data) {
        if (head.data == data) {
            head = head.next;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next.data == data) {
                    if (temp.next == tail) {
                        temp.next = null;
                        tail = temp;
                        return;
                    } else {
                        temp.next = temp.next.next;
                        return;
                    }
                }
                temp = temp.next;
            }
        }
    }

    public void RemoveDuplicate() {
        Node temp = head;
        Node curr = head;
        HashSet<Integer> set = new HashSet<>();

        while (temp != null){
            if(set.isEmpty()){
                set.add(temp.data);
            }else if (set.contains(temp.data)){
                if(curr.next != null){
                    curr.next = curr.next.next;
                }else {
                    curr.next = null;
                }
            }else {
                set.add(temp.data);
                curr = curr.next;
            }
            temp = temp.next;
        }
    }

    public void findMiddle(){
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        System.out.println("Middle = " + turtle.data);
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void ReverseLinkedlist(){
        Node prev = null;
        Node temp=head;
        Node next=null;

        while(temp != null){
            next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head = prev;
    }

    private static final int[] array = new int[100_000];
    public boolean isPalindrome(Node head) {
        if(head==null || head.next==null){
            return true;
        }
        Node h= head;
        final int[] array1 = array;
        int size = 0;

        while(h!=null){
            array1[size++] = h.data;
            h=h.next;
        }

        int m = size/2;
        for(int i=0;i<m;i++){
            if(array[i] != array1[--size]){
                return false;
            }
        }
        return true;
    }

    public void countNode() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Count nodes: " + count);
    }

    public void length() {
        Node temp = head;

        while (temp != null) {
            totalNode++;
            temp = temp.next;
        }
        System.out.println("Total Nodes In LinkedList is: " + totalNode);
    }

    public void find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not present");
    }

    public void getNNode(int value) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == value) {
                System.out.print("Get nth node in linked list: " + temp.data + " ");
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void getEndNode(int value) {
        if (value > totalNode) {
            System.out.println("Enter Correct Position..!!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < totalNode - value; i++) {
            temp = temp.next;
        }
        System.out.println("Get nth node from end in linked linked list: " + temp.data);
    }

    public boolean hasCycle() {
        if (head == null) {
            return false;
        }
        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        //detect cycle
        Node hare = head;
        Node turtle = head;
        boolean cycle = false;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //find meeting point
        turtle = head;
        Node prev = null;//last node
        while(turtle != hare) {
            prev = hare;
            turtle = turtle.next;
            hare = hare.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}