// Last updated: 10/9/2026, 9:32:16 AM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] startparts = startTime.split(":");
        String[] endparts = endTime.split(":");

        int startHours = Integer.parseInt(startparts[0]);
        int startMinutes = Integer.parseInt(startparts[1]);
        int startSec = Integer.parseInt(startparts[2]);
        int totalStartSec = ((startHours * 3600)+(startMinutes * 60)+startSec);

        int endhr = Integer.parseInt(endparts[0]);
        int endmin = Integer.parseInt(endparts[1]);
        int endsec = Integer.parseInt(endparts[2]);
        int totalendsec = ((endhr * 3600)+(endmin * 60)+endsec);

        return totalendsec - totalStartSec;
    }
}