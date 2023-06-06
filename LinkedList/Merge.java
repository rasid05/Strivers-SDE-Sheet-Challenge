public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode list=null;
        ListNode temp1 = list1, temp2 = list2;
        if(list1.val < list2.val){
            ListNode newNode = new ListNode(list1.val);
            list = newNode;
            temp1 = temp1.next;
        }else{
            ListNode newNode = new ListNode(list2.val);
            list = newNode;
            temp2 = temp2.next;
        }

        ListNode temp = list;
        while(temp1!=null && temp2 != null){
            if(temp1.val <= temp2.val){
                ListNode newNode = new ListNode(temp1.val);
                temp.next = newNode;
                temp1 = temp1.next;
                temp = temp.next;
            }else{
                ListNode newNode = new ListNode(temp2.val);
                temp.next = newNode;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        while(temp1 != null){
            ListNode newNode = new ListNode(temp1.val);
            temp.next = newNode;
            temp1 = temp1.next;
            temp = temp.next;
        }
        while(temp2 != null){
            ListNode newNode = new ListNode(temp2.val);
            temp.next = newNode;
            temp2 = temp2.next;
            temp = temp.next;
        }

        return list;
    }
