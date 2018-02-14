import sun.print.CUPSPrinter;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(m==n||head==null)
            return head;
        /*
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        for(int i=0;i<m-1;i++)
            head = head.next;

        ListNode pre = head.next;
        ListNode cur = pre.next;

        for(int i=0;i<n-m;i++){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        head.next.next = cur;
        head.next = pre;
        head = dummy.next;
        dummy = null;
        return head;
        */
        ListNode prev = null;
        ListNode first = new ListNode(0);
        first.next = head;
        int count = 0;
        ListNode curr = first;

        while(curr!=null&&count<n){
            if(count==m-1){
                ListNode start = curr;
                ListNode left = curr.next;
                curr = curr.next;
                while(m<=n){
                    ListNode temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                    m++;
                    count++;
                }
                left.next = curr;
                start.next = prev;
                if(count<n)
                    break;
            }
            else {
                curr = curr.next;
                count++;
            }
        }
        return first.next;

    }

    public static void main(String[] args){
        ReverseLinkedListII l = new ReverseLinkedListII();
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(4);
        ListNode E = new ListNode(5);
        ListNode F = new ListNode(6);
        ListNode G = new ListNode(7);

        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = F;
        F.next = G;
        G.next = null;
        ListNode res = l.reverseBetween(A,2,7);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

}
