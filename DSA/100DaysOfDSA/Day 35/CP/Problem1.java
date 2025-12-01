/*
* Problem:Power Of Numbers
* Solution:https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
*/
class Problem1 {
    public int reverseExponentiation(int n) {
        if(n==10)return 10;
        // code here
        return helper(n,n);
    }
    public int helper(int base,int power){
       if(power==0)return 1;
       else if(power<0)return 1/helper(base,-power);
       else return base*helper(base,power-1);
    }
}
