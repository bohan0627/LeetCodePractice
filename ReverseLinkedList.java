public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args){
        ReverseLinkedList l = new ReverseLinkedList();
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(4);
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = null;
        ListNode res = l.reverseList(A);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
