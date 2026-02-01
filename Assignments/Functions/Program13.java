package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program13 {//Calulate class

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        operations(sc);
    }
    public static void operations(Scanner sc){
        System.out.println("Enter no: a, b");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Choose operations sum,sub,div,mul \n choose exit to stop the operation");
        String opr=sc.next();
        if(opr.equals("sum")){
            System.out.println(sum(a,b));
            operations(sc);
        }
        else if(opr.equals("sub")){
            System.out.println(sub(a,b));
            operations(sc);
        }
        else if(opr.equals("div")){
            System.out.println(div(a,b));
            operations(sc);
        }
        else if(opr.equals("mul")){
            System.out.println(mul(a,b));
            operations(sc);
        }else if(opr.equals("exit")){
            System.out.println("Operation Stopped");
            return;
        }
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int div(int a,int b){
        if(b==0){
            System.out.println("can't divide by 0");
            return 0;
        }
        return a/b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
}