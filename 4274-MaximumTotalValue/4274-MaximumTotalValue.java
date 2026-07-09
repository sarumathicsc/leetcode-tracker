// Last updated: 7/9/2026, 7:39:56 AM
class Solution {
    static final long MOD = 1000000007L;
    public int maxTotalValue(int[] value, int[] decay, int m) {
        long low = 1,high = 1000000000L;
        long threshold = 0;

        while(low <= high){
            long mid = (low+high)/2;
            long count = 0;
            for(int i = 0;i < value.length;i++){
                if(value[i] >= mid){
                    count += (value[i] - mid)/decay[i]+1;
                    if(count >= m) break;
                }
            }
            if(count >= m){
                threshold = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        long total = 0;
        long used = 0;

        for(int i =0; i < value.length;i++){
            if(value[i] < threshold) continue;
            long cnt = (value[i] - threshold) / decay[i]+1;
            used += cnt;

            long first = value[i];
            long last = value[i] - (cnt - 1L)*decay[i];
            total = (total + cnt % MOD*((first + last)%MOD)%MOD*inv2())%MOD;
        }
        long extra = used - m;
        total = (total - (extra % MOD)*(threshold%MOD))%MOD;
        if(total < 0) total += MOD;
        return (int) total;
    }
    private long inv2(){
        return 500000004L;
    }
}