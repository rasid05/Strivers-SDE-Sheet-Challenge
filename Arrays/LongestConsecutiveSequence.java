public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int ans = 1;
        int cnt = 1;
        for(int i = 1;i < nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                cnt++;
            }else if(nums[i]==nums[i-1]){
                
            }
            else{
                ans = Math.max(ans, cnt);
                cnt = 1;
            }
        }
        ans = Math.max(ans, cnt);
        return ans;
    }
