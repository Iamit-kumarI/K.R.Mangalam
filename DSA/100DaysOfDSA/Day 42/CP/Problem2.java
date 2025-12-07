
import java.util.ArrayList;
import java.util.HashSet;

/*
* Problem:Permutations of a String
* Solution:https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
*/
public class Problem2 {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> list = new ArrayList<>();
        if (s.length() == 0) {
            return list;
        }
        helper("", s, list);
        return list;
    }

    public static void helper(String prefix, String remaning, ArrayList<String> list) {
        if (remaning.length() == 0) {
            list.add(prefix);
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < remaning.length(); i++) {
            char ch = remaning.charAt(i);
            if (set.contains(ch)) {
                continue;//to avoid kk -> kk, kk

                        }set.add(ch);
            String newPrefix = prefix + ch;
            String left = remaning.substring(0, i) + remaning.substring((i + 1));
            helper(newPrefix, left, list);
        }
    }
}
