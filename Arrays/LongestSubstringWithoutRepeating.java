public static int uniqueSubstrings(String s) {

		    if(s.length()==0 )
             return 0;
        int ans = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i =0;i<s.length();i++){
            Set<Character> set = new HashSet<>();
            cnt =0;
            for(int j = i; j < s.length(); j++) {
                if(set.contains(s.charAt(j))){
                    ans = Math.max(ans, cnt);
                    break;
                }else{
                    set.add(s.charAt(j));
                    cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        ans = Math.max(ans, cnt);
        return ans;
	}
