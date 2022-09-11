package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07_Deneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf>='a'&& harf<='z'){
            System.out.println("kucuk harf");
        } else if (harf>='A'&&harf<='Z'){
            System.out.println("buyuk harf");

        }else {
            System.out.println("Hatali kod");
        }




        System.out.println(harf);
    }
}
