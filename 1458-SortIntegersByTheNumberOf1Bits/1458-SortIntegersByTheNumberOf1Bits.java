// Last updated: 7/9/2026, 7:41:29 AM
class Solution {
    public int[] sortByBits(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            arr[i] += Integer.bitCount(arr[i])*100001;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            arr[i] %= 100001;
        }
        return arr;
    }
}