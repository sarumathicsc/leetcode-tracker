// Last updated: 10/9/2026, 9:34:54 AM
class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
 
        String yearBin = Integer.toBinaryString(Integer.parseInt(parts[0]));
        String monthBin = Integer.toBinaryString(Integer.parseInt(parts[1]));
        String dayBin = Integer.toBinaryString(Integer.parseInt(parts[2]));
        
        return yearBin + "-" + monthBin + "-" + dayBin;
    }
}
