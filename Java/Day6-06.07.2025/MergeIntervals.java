import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        for (int[] row : intervals) {
            // If res is empty or no overlap, add the interval
            if (res.isEmpty() || res.get(res.size() - 1)[1] < row[0]) {
                res.add(row);
            } else {
                // There is overlap, so merge intervals
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], row[1]);
            }
        }

        // Convert List<int[]> to int[][]
        return res.toArray(new int[res.size()][]);
    }
}
