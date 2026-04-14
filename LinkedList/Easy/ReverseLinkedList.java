import java.util.*;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class ReverseLinkedList{
    public static Node reverselist(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Nodes : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("Empty List");
            return;
        }
        System.out.println("Enter Elements : ");
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i=1;i<n;i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        System.out.print("Original List : ");
        printList(head);
        head = reverselist(head);
        System.out.print("Reversed List : ");
        printList(head);
    }
}