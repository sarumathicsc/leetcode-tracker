// Last updated: 10/9/2026, 9:32:54 AM
class Solution {
    public int kthDigit(long k) {
       if(k <= 9){
           return(int) k;
       }
       k -= 9;

        for(int d = 2; d <= 18; d++){
            long blocks;
            if( d == 2){
                blocks = 9;
            }else{
                blocks = 9 * pow10(d - 2);
            }
            long blocksize = 10L * d;
            long total = blocks * blocksize;

            if(k > total){
                k -= total;
            }else{
                long blockindex = (k-1)/blocksize;
                long pos = (k - 1)%blocksize;
                long b;

                if(d == 2){
                    b = 1+blockindex;
                }else{
                    b = pow10(d - 2)+blockindex;
                }
                int numberindex = (int)(pos/d);
                long number;
                if(b%2 == 0){
                    number = 10 * b + numberindex;
                }else{
                    number = 10*b +(9 - numberindex);
                }
                int digitindex = (int)(pos % d);
                String s = String.valueOf(number);
                return s.charAt(digitindex) - '0';
            }
        }
        return -1;
    }

    private long pow10(int n){
        long result = 1;
        for(int i = 0; i < n; i++){
            result *= 10;
        }
        return result;
    }
}