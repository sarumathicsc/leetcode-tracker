// Last updated: 7/9/2026, 7:40:11 AM
import java.util.*;

public class Solution {

    static class Event {
        long y;
        int type;
        long x1, x2;

        Event(long y, int type, long x1, long x2) {
            this.y = y;
            this.type = type;
            this.x1 = x1;
            this.x2 = x2;
        }
    }

    public double separateSquares(int[][] squares) {
        List<Event> events = new ArrayList<>();

        for (int[] s : squares) {
            long x = s[0], y = s[1], l = s[2];
            events.add(new Event(y, 1, x, x + l));
            events.add(new Event(y + l, -1, x, x + l));
        }

        events.sort(Comparator.comparingLong(e -> e.y));

        List<long[]> active = new ArrayList<>();
        List<long[]> segments = new ArrayList<>();

        long prevY = events.get(0).y;
        double totalArea = 0;

        // ---- FIRST PASS: compute total union area ----
        for (Event e : events) {
            long currY = e.y;
            double height = currY - prevY;

            if (height > 0 && !active.isEmpty()) {
                double width = unionX(active);
                double area = width * height;
                totalArea += area;
                segments.add(new long[]{prevY, currY});
            }

            if (e.type == 1) {
                active.add(new long[]{e.x1, e.x2});
            } else {
                removeInterval(active, e.x1, e.x2);
            }

            prevY = currY;
        }

        // ---- SECOND PASS: find split y ----
        double target = totalArea / 2.0;
        active.clear();
        prevY = events.get(0).y;
        double currArea = 0;

        for (Event e : events) {
            long currY = e.y;
            double height = currY - prevY;

            if (height > 0 && !active.isEmpty()) {
                double width = unionX(active);
                double area = width * height;

                if (currArea + area >= target) {
                    double remain = target - currArea;
                    return prevY + remain / width;
                }

                currArea += area;
            }

            if (e.type == 1) {
                active.add(new long[]{e.x1, e.x2});
            } else {
                removeInterval(active, e.x1, e.x2);
            }

            prevY = currY;
        }

        return prevY;
    }

    private void removeInterval(List<long[]> list, long x1, long x2) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] == x1 && list.get(i)[1] == x2) {
                list.remove(i);
                return;
            }
        }
    }

    private double unionX(List<long[]> intervals) {
        intervals.sort(Comparator.comparingLong(a -> a[0]));

        long total = 0;
        long start = intervals.get(0)[0];
        long end = intervals.get(0)[1];

        for (int i = 1; i < intervals.size(); i++) {
            long[] curr = intervals.get(i);
            if (curr[0] > end) {
                total += end - start;
                start = curr[0];
                end = curr[1];
            } else {
                end = Math.max(end, curr[1]);
            }
        }
        total += end - start;
        return total;
    }
}
