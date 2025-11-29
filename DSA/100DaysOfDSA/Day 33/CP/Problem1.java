/*
* Problem:Upper Case Conversion
* Solution: https://discuss.geeksforgeeks.org/comment/d8af3b9c-3419-47ca-82bf-1c65b60e64b0/practice
*/

    class Problem1 {//by mistake i have put 29 nov its 30 nov
    public String convert(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(s.charAt(i)));
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

