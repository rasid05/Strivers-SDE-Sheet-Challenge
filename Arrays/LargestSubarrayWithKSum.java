        //  K == 0 here 


//         int ans = 0;
//         for(int i =0; i < arr.length; i++) {
//             int sum = 0;
//             for(int j = i; j < arr.length; j++) {
//                 sum+=arr[j];
//                 if(sum==0)
//                   ans = Math.max(ans, j-i+1);
//             }
//         }
//         return ans;

        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += A[i]; 

            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {

                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
