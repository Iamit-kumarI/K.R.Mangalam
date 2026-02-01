package Leetcode.Assignments.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isPalin(num+"");
        isArmstrong(num);
        isPerfect(num);
        checkNiven(num);
        isNeon(num);
        isTwistedPrime(num+"");
    }
    public static void isPalin(String n){//no return type
        System.out.println("Palindrome : "+(n.equals(new StringBuilder(n).reverse().toString())));
    }
    public static void isArmstrong(int n){
        int cubeSum=0,given=n;
        while(n>0){
            cubeSum+=Math.pow(n%10,3);
            n/=10;
        }
        System.out.println("Armstrong : "+(cubeSum==given));
    }
    public static void isPerfect(int n){
        List<Integer>list=new ArrayList<>();
        for(int i=2;i*i<n;i++){
            if(list.isEmpty())list.add(1);
            if(n%i==0){
                list.add(i);
                if(i!=n/i)list.add(n/i);
            }
        }
        System.out.println("Perfect : "+(list.stream().mapToInt(x -> x).sum()==n));
    }
    public static void checkNiven(int n){
        int given=n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Niven : "+(given%sum==0));
    }
    public static void isNeon(int n){
        int square=n*n;
        int sum=0;
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        System.out.println("Neon : "+(n==sum));
    }
    public static void isTwistedPrime(String n){
        int revN=Integer.parseInt(new StringBuilder(n).reverse().toString());
        if(revN<=1)System.out.println("Twisted Prime : false");
        if(revN==2){
            System.out.println("Twisted Prime : true");
        }
        for(int i=2;i*i<=revN;i++){
            if(revN%i==0){
                System.out.println("Twisted Prime : flase");
            }
        }
        System.out.println("Twisted Prime : true");
    }
}
