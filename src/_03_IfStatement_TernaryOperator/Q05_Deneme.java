package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05_Deneme {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Yasinizi ve kilonuzu girin");
        int yas=scan.nextInt();
        int kilo=scan.nextInt();

        if (yas<=18){
            System.out.println("kan bagisi yapilamaz");
        } else if (yas>=18&kilo<=50){
            System.out.println("50 kilodan hafifler bagis yapamaz");
        } else{
            System.out.println("Bagis yapabilir");
        }
    }
}
