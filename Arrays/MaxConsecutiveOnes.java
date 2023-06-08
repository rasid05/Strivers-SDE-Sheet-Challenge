public int findMaxConsecutiveOnes(int[] arr) {
        int ans = 0, cnt = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 1) {
      cnt++;
      ans = Math.max(ans, cnt);
    } else {
      cnt = 0;
    }
  }
  return ans;
    }
