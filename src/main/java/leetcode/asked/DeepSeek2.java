package leetcode.asked;

/*
Task 2: Car Navigation Graph (Graph / Shortest Path with Constraints)
You have a map of roads represented as a directed graph where nodes are intersections and edges are roads with a given travel time.
Some roads are toll roads, and your vehicle has a limited budget for tolls. Find the shortest travel time from a start intersection
to a destination intersection, without exceeding a given toll budget B.

Input:
n: number of intersections (0 to n-1)
edges: list of [u, v, time, toll] where u and v are intersections (0-indexed), time is travel time in minutes, toll is cost in euros.
start: starting intersection
dest: destination intersection
B: maximum total toll allowed

Output:
Return the minimum travel time from start to dest without exceeding the toll budget. If no such path exists, return -1.
Example:
text
n = 5
edges = [
  [0,1,10,5],
  [1,2,20,2],
  [0,2,30,10],
  [2,3,15,0],
  [3,4,5,3],
  [1,4,25,8]
]
start = 0, dest = 4, B = 10
One possible path: 0→1 (toll=5, time=10) + 1→4 (toll=8, time=25) total toll=13 >10 → invalid.
Another: 0→2 (toll=10, time=30) + 2→3 (toll=0, time=15) + 3→4 (toll=3, time=5) total toll=13 >10? Actually toll=10+0+3=13>10 invalid.
What about 0→2 (toll=10, time=30) + 2→3 (toll=0, time=15) + 3→4 (toll=3) = toll=13 >10.
0→1→2→3→4: toll=5+2+0+3=10 exactly, time=10+20+15+5=50.
0→1→2→4? Not directly, 2→4 not present.
0→1→4 we already did toll=13.
So best is 50 minutes.
Constraints:

1 <= n <= 1000
0 <= edges.length <= 10^4
1 <= time, toll <= 1000
0 <= B <= 10000
 */
public class DeepSeek2 {
    private DeepSeek2() {}

}
