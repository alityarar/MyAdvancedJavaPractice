package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08_Deneme {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("kartiniz varsa 1, yoksa 2 ye basin\naldiginiz urun sayisini girin\nfiyati girin");
        int kart=scan.nextInt();
        int sayi=scan.nextInt();
        int fiyat=scan.nextInt();

        if (kart==1&&sayi>=10){
            System.out.println(fiyat*0.8);
        } else if (kart==1&&sayi<=10){
            System.out.println(fiyat*0.85);
        } else if (kart==2&&sayi>=10){
            System.out.println(fiyat*0.85);
        } else if (kart==2&&sayi<=10){
            System.out.println(fiyat*0.9);
        }
    }
}
