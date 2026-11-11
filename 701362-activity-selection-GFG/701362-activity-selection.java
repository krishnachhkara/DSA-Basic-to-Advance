import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {

        int n = start.length;

        if (n == 0) return 0;

        Integer[] meetings = new Integer[n];

        for (int i = 0; i < n; i++) {
            meetings[i] = i;
        }

        Arrays.sort(meetings, (a, b) ->
            Integer.compare(finish[a], finish[b])
        );

        int count = 1;
        int lastEnd = finish[meetings[0]];

        for (int i = 1; i < n; i++) {

            int idx = meetings[i];

            if (start[idx] > lastEnd) {
                count++;
                lastEnd = finish[idx];
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna