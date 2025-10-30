/*
 * Problem: Rotate Array Clockwise
 * Solution: https://discuss.geeksforgeeks.org/comment/4c789bdb-0593-44d8-abb9-ba3559c50c4c/practice
 */
class Problem2 {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        helper(arr,arr.length,k%arr.length);
    }
    public static void helperhelper(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  public static void helper(int[] arr, int n, int k) {
    helperhelper(arr,0,n-1);
    helperhelper(arr,0,k-1);
    helperhelper(arr,k,n-1);
  }
}