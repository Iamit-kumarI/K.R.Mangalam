/*
* Problem:URLify a given string
* Solution:https://discuss.geeksforgeeks.org/comment/086acf26-8b57-4d43-a3cc-da6965c87d9f/practice
 */
public class Problem1 {
    String URLify(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                // sb.append('%');
                // sb.append('2');
                // sb.append('0');
                sb.append("%20");
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
