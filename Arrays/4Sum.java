public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                Set<Long> hashset = new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    if (hashset.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    hashset.add((long) nums[k]);
                }
            }
        }

        List<List<Integer>> a = new ArrayList<>(ans);
        return a;   
    }
