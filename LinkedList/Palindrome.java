public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        Stack<Integer> st= new Stack<>();
        temp = head;
        int first = count/2;
        while(first > 0){
            st.add(temp.val);
            temp = temp.next;
            first--;
        }
        if(count % 2 != 0)
            temp = temp.next;
        
        while(temp != null){
            if(st.pop() != temp.val)
                return false;
            temp = temp.next;
        }
        if(st.isEmpty())
            return true;
        return false;
    
