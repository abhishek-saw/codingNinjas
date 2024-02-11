package DSAInJAVA.LinkedList.LinkedListOneTwo;

public class PalindromeLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(9);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(3);
        Node<Integer> n5 = new Node<>(2);
        Node<Integer> n6 = new Node<>(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        System.out.println(isPalindrome(n1));
    }

    public static boolean isPalindrome(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        Node<Integer> prev;
        Node<Integer> temp;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.data != slow.data) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
}
