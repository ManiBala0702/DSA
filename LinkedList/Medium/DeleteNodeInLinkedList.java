import java.util.*;
public class DeleteNodeInLinkedList {
    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            System.out.println("Cannot delete this node using this method.");
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    public static ListNode findNode(ListNode head, int value) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ListNode head = buildList(arr);
        System.out.println("Original List:");
        printList(head);
        System.out.print("Enter value of node to delete: ");
        int val = sc.nextInt();
        ListNode nodeToDelete = findNode(head, val);
        if (nodeToDelete == null) {
            System.out.println("Value not found in list.");
        } else {
            deleteNode(nodeToDelete);

            System.out.println("After Deletion:");
            printList(head);
        }
        sc.close();
    }
}