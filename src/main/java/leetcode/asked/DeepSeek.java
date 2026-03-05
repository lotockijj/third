package leetcode.asked;

/*
Task 1: Process Sensor Data (Array / Sliding Window)
You are receiving a stream of timestamped speed measurements from a fleet of cars.
For a given time window of size k (in seconds), you need to compute the maximum average speed
over any contiguous subarray of measurements that falls entirely within that window.

Input:
An array of doubles speeds representing speed readings (in km/h), each taken at consecutive integer seconds
(i.e., index i corresponds to second i).
An integer k – the window size in seconds.

Output:
Return the maximum average speed over any contiguous subarray of length exactly k.

Example:
Input: speeds = [4.0, 2.5, 7.0, 8.5, 3.0, 5.0], k = 3
Output: 6.5
Explanation: The subarray [7.0, 8.5, 3.0] has sum 18.5, average 6.166...; but the subarray [8.5, 3.0, 5.0] has sum 16.5, average 5.5.
Actually recalc: [4,2.5,7] avg=4.5; [2.5,7,8.5] avg=6.0; [7,8.5,3] avg≈6.166; [8.5,3,5] avg=5.5 -> max 6.166? Wait, example output says 6.5.

Better example:
speeds = [1,12,-5,-6,50,3], k = 4
subarrays of length 4: [1,12,-5,-6] sum=2 avg=0.5; [12,-5,-6,50] sum=51 avg=12.75; [-5,-6,50,3] sum=42 avg=10.5 -> max average = 12.75
Let me correct: I'll provide a cleaner example.
Constraints:
1 <= k <= speeds.length <= 10^5
-10^4 <= speeds[i] <= 10^4
 */
public class DeepSeek {

    private DeepSeek() {}

    //[4.0, 2.5, 7.0, 8.5, 3.0, 5.0]
    // 0 ,  1,   2,   3
    public static double solution(double[] speeds, int k) {
        double result = 0.0;
        if (speeds.length < k) {
            return result;
        }
        double tempResult = 0.0;
        for (int i = 0; i < speeds.length - 1; i++) {
            tempResult += speeds[i];
            if (i >= k) {
                tempResult -= speeds[i - k];
                result = Math.max(result, tempResult);
            }
        }
        return result / k;
    }
}
