/*
 * Problem:50. Pow(x, n)
 * Solution: https://leetcode.com/problems/powx-n/solutions/7308993/java-beats-100-recursion-approach-by-ami-h8og
 */
class Problem3 {
        
    public double myPow(double x, int n) {
        // n getting out of integer limit need to make it long other wise it overflow
        //Math.pow(x,n)
        long a = n;
        if (a < 0) {
            return 1 / myBhaji(x, -a);
        }
        return myBhaji(x, n);
    }

    public double myBhaji(double x, long n) {
        if (n == 0) {
            return 1;
        }
        // if(n<0)return 1/myPow(x,-n);// for -ve
        double mid = myBhaji(x, n / 2);
        if (n % 2 == 0) {
            return mid * mid; 
        }else {
            return x * mid * mid;
        }
    }
}
