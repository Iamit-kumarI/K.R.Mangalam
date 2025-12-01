/*
* Problem:Print N to 1 without loop
* Solution:https://discuss.geeksforgeeks.org/comment/339257c0-22db-44e5-abeb-e508bab37d10/practice
*/
class Problem1 {

    void printNos(int N) {
        // code here
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);

    }
}
