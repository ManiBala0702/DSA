import java.util.*;
public class MiddleOfTheLinkedList{
    public static Node findmiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        System.out.print("Enter The No.Of.Nodes : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Empty List");
            return;
        }
        System.out.println("Enter Elements : ");
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for(int i=1;i<n;i++){
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        System.out.print("List of Nodes : ");
        printList(head);
        Node middle = findmiddle(head);
        System.out.println("Middle Node: "+middle.val);
    }
}