package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayinizi girin:");
        sayi1 = input.nextInt();
        System.out.println("ikinci sayinizi girin");
        sayi2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;

        for(int i=sayi1;i>=1;i--){
            if(sayi1%i==0&&sayi2%i==0){
                ebob=i;
                System.out.println("ebob:"+i);
                break;
        for(int k=1;k<=sayi1*sayi2;k++){
            if(sayi1%k==0&&sayi2%k==0){
                System.out.println(k);

            }


        }


    }
}



















