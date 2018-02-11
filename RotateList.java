public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        //ListNode res = new ListNode();
        if(head == null)
            return head;
        int listSize = 1;
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
            listSize++;
        }
        temp.next = head;
        if(k>=listSize)
            k %= listSize;

        ListNode find = head;
        int i = listSize-k-1;
        while(i>0){
            find = find.next;
            i--;
        }
        ListNode res = find.next;
        find.next = null;
        return  res;
    }

    public static void main(String[] args){
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = null;
        RotateList r = new RotateList();
        ListNode res = r.rotateRight(h5.next,12);
        System.out.println(res.val);
    }
}
