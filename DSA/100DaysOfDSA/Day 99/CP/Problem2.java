/*
* Problem: Circular Tour (simplified)
* Solution:https://leetcode.com/problems/most-visited-sector-in-a-circular-track/submissions/1904606728/
*/
class Problem2 {

    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0], end = rounds[rounds.length - 1];
        List<Integer> list = new ArrayList<>();
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                list.add(i);
            }
        } else {
            for (int i = 1; i <= end; i++) {
                list.add(i);
            }
            for (int i = start; i <= n; i++) {
                list.add(i);
            }
        }
        return list;
    }
}
