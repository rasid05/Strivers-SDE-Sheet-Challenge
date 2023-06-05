public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            return;
        }
        
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void reverse(int[] arr, int start, int end) {
        if (start < 0 || end >= arr.length || start >= end) {
            System.out.println("Invalid indices.");
            return;
        }
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] a) {
        int idx = -1;
        int n = a.length;
        for(int i = n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                idx = i;
                break;
            }
        }

        if(idx ==-1){
            Arrays.sort(a);
            return;
        }

        for(int i = n-1;i>=idx;i--){
            if(a[i]>a[idx]){
                swap(a, i, idx);
                break;
            }
        }
        reverse(a,idx+1,n-1);
    }
