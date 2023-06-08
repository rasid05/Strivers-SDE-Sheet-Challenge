public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA, t2 = headB;
        while(t2!=null){
            t1 = headA;
            while(t1 != null){
                if(t1 == t2)
                    return t1;
                t1 = t1.next;
            }
            t2= t2.next;
        }
        return null;
    }
