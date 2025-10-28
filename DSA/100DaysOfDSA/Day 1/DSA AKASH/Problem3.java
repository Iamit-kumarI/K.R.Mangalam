//Name: Leap Year (gfg)

class Problem3 {
    public static void main(String []args){
        System.out.println(isLeap(40));
    }
    public static boolean isLeap(int N) {
        if ((N % 4 == 0 && N % 100 != 0) || (N % 400 == 0)) {
            return true;
        }
        return false;
    }
}
