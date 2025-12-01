/*
* Problem: Print 1 To N Without Loop
* Solution:https://discuss.geeksforgeeks.org/comment/615fca9e-c97e-40ae-8938-573a75af306c/practice
*/
public class Problem2 {
    public void printNos(int n) {
        // Code here
        if (n == 0) {
            return;
        }
        printNos(n - 1);
        System.out.print(n + " ");
    }
}
