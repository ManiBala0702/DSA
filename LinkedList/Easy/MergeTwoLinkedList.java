import java.util.*;
public class MergeTwoLinkedList{
    public static Node merge(Node l1, Node l2){
        if(l1==null)
            return l2;
        if (l2==null)
            return l1;
        Node curr = null;
        Node res = null;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                if(curr == null){
                    curr = l1;
                    res = curr;
                }
                else{
                    curr.next = l1;
                    curr = curr.next;
                }
                l1 = l1.next;
            }
            else{
                if(curr==null){
                    curr = l2;
                    res = curr;
                }
                else{
                    curr.next = l2;
                    curr = curr.next;
                }
                l2 = l2.next;
            }
        }
        while(l1!=null){
            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;
        }
        while(l2!=null){
            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }
        return res;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp =temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No.Of Nodes List1: ");
        int n1 = sc.nextInt();
        Node l1 = null, temp1 = null;
        if (n1 > 0) {
            System.out.println("Enter elements of List 1 (sorted):");
            l1 = new Node(sc.nextInt());
            temp1 = l1;

            for (int i = 1; i < n1; i++) {
                temp1.next = new Node(sc.nextInt());
                temp1 = temp1.next;
            }
        }

        // Input for second list
        System.out.print("Enter number of nodes for List 2: ");
        int n2 = sc.nextInt();

        Node l2 = null, temp2 = null;

        if (n2 > 0) {
            System.out.println("Enter elements of List 2 (sorted):");
            l2 = new Node(sc.nextInt());
            temp2 = l2;

            for (int i = 1; i < n2; i++) {
                temp2.next = new Node(sc.nextInt());
                temp2 = temp2.next;
            }
        }

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        // Merge
        Node merged = merge(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}