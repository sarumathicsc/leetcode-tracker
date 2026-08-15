// Last updated: 8/15/2026, 9:26:15 PM
1class Solution {
2    public int kthDigit(long k) {
3       if(k <= 9){
4           return(int) k;
5       }
6       k -= 9;
7
8        for(int d = 2; d <= 18; d++){
9            long blocks;
10            if( d == 2){
11                blocks = 9;
12            }else{
13                blocks = 9 * pow10(d - 2);
14            }
15            long blocksize = 10L * d;
16            long total = blocks * blocksize;
17
18            if(k > total){
19                k -= total;
20            }else{
21                long blockindex = (k-1)/blocksize;
22                long pos = (k - 1)%blocksize;
23                long b;
24
25                if(d == 2){
26                    b = 1+blockindex;
27                }else{
28                    b = pow10(d - 2)+blockindex;
29                }
30                int numberindex = (int)(pos/d);
31                long number;
32                if(b%2 == 0){
33                    number = 10 * b + numberindex;
34                }else{
35                    number = 10*b +(9 - numberindex);
36                }
37                int digitindex = (int)(pos % d);
38                String s = String.valueOf(number);
39                return s.charAt(digitindex) - '0';
40            }
41        }
42        return -1;
43    }
44
45    private long pow10(int n){
46        long result = 1;
47        for(int i = 0; i < n; i++){
48            result *= 10;
49        }
50        return result;
51    }
52}