public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;mid++;
            }else if(nums[mid]==2){
                swap(nums,high,mid);
                high--;
            }else{
                mid++;
            }
        }
    }
