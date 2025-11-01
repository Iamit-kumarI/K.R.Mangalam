package CP;

/*
 * Problem:Equilibrium Point (gfg)
 * Solution: https://discuss.geeksforgeeks.org/comment/3af0da29-652c-4caa-bdb0-750d09850f12/practice
 */
public class Problem2 {

    public static int findEquilibrium(int arr[]) {
        // code here
        int sum = 0, leftsum = 0;
        for (int val : arr) {
            sum += val;
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (leftsum == sum) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
