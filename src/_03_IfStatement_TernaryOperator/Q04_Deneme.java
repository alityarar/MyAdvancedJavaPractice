package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04_Deneme {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz");
        String JobTitle= scan.next();

        String qa="Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";

        if (JobTitle.equalsIgnoreCase("qa")){
            System.out.println("Mesleginiz qa");
        } else if (JobTitle.equalsIgnoreCase("dev")){
            System.out.println("mesleginiz dev");
        } else if (JobTitle.equalsIgnoreCase("ba")){
            System.out.println("Mesleginiz ba");
        } else if (JobTitle.equalsIgnoreCase("pm")){
            System.out.println("mesleginiz pm");
        } else{
            System.out.println("Hatali kod girdiniz");
        }
    }
}
