/*
* Problem:Expression Evaluation without operator precedence
* Solution:https://leetcode.com/problems/basic-calculator-ii/submissions/1893479744/
*/
class Problem1 {
    public int calculate(String s) {
        int len = s.length();
        char op = '+';
        int prev = 0;
        int number = 0;
        int total = 0;
        StringBuilder sb = new StringBuilder(s);
        sb.append('+');
    
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (c >= '0' && c <= '9') {
                number = number * 10 + c - '0';
            }

            else if (c != ' ') {
                if (op == '+' || op == '-') {
                    total += prev;
                    prev = op == '+' ? number : -number;
                }
                else if (op == '/') {
                    prev = prev / number; 
                }
                else if (op == '*') {
                    prev = prev * number; 
                }

                number = 0;
                op = c;
            }
        }
// public static int calculate(String s) {
//         List<String>list=new ArrayList<>();
//         StringBuilder sb=new StringBuilder();
//         for(char c:s.toCharArray()){
//             if(Character.isDigit(c)){
//                 sb.append(c);
//             }else{
//                 list.add(sb.toString());
//                 sb.setLength(0);
//                 list.add(String.valueOf(c));
//             }
//             list.add(sb.toString());
//         }
//         String[]arr=list.toArray(new String[0]);
//         for(int i=1;i<arr.length;i++){
//             if(arr[i].equals("*")){
//                 int left=1;
//                 int right=1;
//                 int val=left*right;
//             }
//         }
//         System.out.println(arr[4]);
//         return 1;
//     }
        return total + prev;
    }
}