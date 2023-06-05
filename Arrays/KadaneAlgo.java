public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        boolean flag = false;
        for(int i =0; i<nums.length;i++){
            curSum += nums[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
