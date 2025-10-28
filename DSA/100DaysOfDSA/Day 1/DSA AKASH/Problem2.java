/*
 * profile: https://www.geeksforgeeks.org/user/akumar300/
 * Name: area of circle (gfg)
 */
class Problem2 {
    // Method to calculate the area (assuming it's a circle with the given radius)
    public static void main(String[]args){
        System.out.println(calculateArea(5.0));
    }
    public static double calculateArea(double r) {
        return Math.PI*(r*r);
    }
}