// Last updated: 7/12/2026, 8:18:24 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] startparts = startTime.split(":");
4        String[] endparts = endTime.split(":");
5
6        int startHours = Integer.parseInt(startparts[0]);
7        int startMinutes = Integer.parseInt(startparts[1]);
8        int startSec = Integer.parseInt(startparts[2]);
9        int totalStartSec = ((startHours * 3600)+(startMinutes * 60)+startSec);
10
11        int endhr = Integer.parseInt(endparts[0]);
12        int endmin = Integer.parseInt(endparts[1]);
13        int endsec = Integer.parseInt(endparts[2]);
14        int totalendsec = ((endhr * 3600)+(endmin * 60)+endsec);
15
16        return totalendsec - totalStartSec;
17    }
18}