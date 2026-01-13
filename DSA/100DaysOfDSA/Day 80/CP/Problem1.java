/*
* Problem:Sort Stack (using another stack)
* Solution:https://www.geeksforgeeks.org/problems/sort-a-stack/1
*/

import java.util.Stack;

class Solution {
    public void sortStack(Stack<Integer> st) {
        Stack<Integer> stack = new Stack<>();
        // st.stream().sorted().collect(Collectors.toCollection(Stack::new));
        st.sort((a,b)->a-b);
    }
}