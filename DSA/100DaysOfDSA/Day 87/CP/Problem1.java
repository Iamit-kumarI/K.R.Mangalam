/*
* Problem:Check Duplicate Parentheses
* Solution:https://www.geeksforgeeks.org/problems/expression-contains-redundant-bracket-or-not/1
*/
class Problem1 {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<StringBuilder> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(new StringBuilder("("));
            }
            else if(s.charAt(i)==')'){
                st.peek().append(")");
                StringBuilder sb = st.peek();
                st.pop();
                if(sb.length()>3){
                    if(st.empty()){
                        st.push(new StringBuilder("a"));
                    }
                    else st.peek().append("a");
                }
                else{
                    return true;
                }
            }
            else{
                if(st.empty())st.push(new StringBuilder());
                st.peek().append(s.charAt(i));
            }
        }
        return false;
    }
}
