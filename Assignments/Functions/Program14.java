package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int costPrice=sc.nextInt(),sellingPrice=sc.nextInt();
        if(costPrice<sellingPrice){
            profit(costPrice,sellingPrice);
        }else if(costPrice==sellingPrice){
            System.out.println("No Profilt & Loss");
        }else{
            loss(costPrice,sellingPrice);
        }
    }
    public static void profit(int buyAt,int selAt){
        System.out.print((double) ((selAt-buyAt)/buyAt)*100);
        System.out.print("%profile");
    }
    public static void loss(int buyAt,int selAt){
        System.out.print((double) ((buyAt-selAt)/buyAt)*100);
        System.out.print(" %loss");
    }
}
