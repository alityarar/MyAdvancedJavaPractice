package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01_Deneme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" toplama icin 1\n Cikarma icin 2\n bolme icin 3\n carpma icin 4\n");
        System.out.println("lutfen birinci sayiyi giriniz");
        System.out.println("lutfen ikinci sayiyi giriniz");
        int islem=scan.nextInt();
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();

        if (islem==1){
            System.out.println("Toplama isleminin sonucu : "+ (num1+num2));
        } else if (islem==2){
            System.out.println(num1-num2);
        } else if (islem==3){
            System.out.println(num1/num2);
        } else if (islem==4){
            System.out.println(num1*num2);
        }else System.out.println("Hatali giris yaptiniz");

        System.out.println("\"java\"");




    }
}
