import java.lang.reflect.Array;
import java.util.*;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1!=null){
            s1.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            s2.add(l2.val);
            l2 = l2.next;
        }

        ListNode res = new ListNode(0);
        ListNode temp = new ListNode(-1);
        int add =0;

        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty() && !s2.isEmpty()){
                res.next = new ListNode((s1.peek() + s2.peek()+ add)%10);
                add = (s1.pop() + s2.pop()+add)/10;
                if(temp.val>=0)
                    res.next.next = temp;
                temp = res.next;
            }
            else if(s1.isEmpty()){
                res.next = new ListNode((s2.peek() + add)%10);
                add = (s2.pop()+add)/10;
                if(temp.val>=0)
                    res.next.next = temp;
                temp = res.next;
            }
            else{
                res.next = new ListNode((s1.peek() + add)%10);
                add = (s1.pop()+add)/10;
                if(temp.val>=0)
                    res.next.next = temp;
                temp = res.next;
            }
        }
        if(add>0){
            res.next = new ListNode(add);
            add = 0;
            res.next.next = temp;
        }
        res = res.next;
        return res;
    }



    public static void main(String[] args){
        int[] num1 = {1,3,4};
        int[] num2 = {1,2,3,4,5};

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.addLast(2);
        l1.addLast(5);
        l1.addLast(4);
        l2.addLast(1);
        l2.addLast(2);
        l2.addLast(3);
        l2.addLast(4);
        l2.addLast(5);
    }
}
