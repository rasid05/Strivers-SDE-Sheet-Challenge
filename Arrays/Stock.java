        int minTillNow = p[0];
        int maxProfit = 0;
        for (int i=1;i<p.length;i++){
            minTillNow = Math.min(p[i],minTillNow);
            maxProfit = Math.max(maxProfit, p[i]-minTillNow);
        }
        return maxProfit;
