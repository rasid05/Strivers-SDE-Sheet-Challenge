public int[] twoSum(int[] nums, int target) {
        // Sol 1 : Using 2 loop 
        // Sol 2 : Using map - O(n) O(n)

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if (map.containsKey(temp))
                return new int[] {map.get(temp),i};
            map.put(nums[i], i);
        }
        return new int[] {-1,last};

        // Solution 3 : O(1)-space  -> If array index not matters
        // Arrays.sort(nums);
        // int st=0,last=nums.length-1;
        // while(st < last){
        //     int temp = nums[st] + nums[last];
        //     if(temp == target){
        //         return new int[] {st,last};
        //     }else if(temp > target)
        //         last--;
        //     else 
        //         st++;
        // }
        // return new int[] {st,last};
    }
