/*
* Problem:258. Add Digits
* Solution:https://leetcode.com/problems/add-digits/solutions/7401682/java-beats-100-hashset-by-amitk300-mu3z
*/
class Problem1 {
    public int addDigits(int num) {
       int sum=helper(num,0);
        while(sum>=10){
            sum=helper(sum,0);
        }
        return sum;
    }
    public static int helper(int num,int val){
        if(num<=0)return val;
        return helper(num/10,val+=num%10);
    }
}
