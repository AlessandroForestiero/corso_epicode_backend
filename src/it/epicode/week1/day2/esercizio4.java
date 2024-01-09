package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero=scanner.nextInt();
        for (int i=numero;i>=0;i--){
            System.out.println(i);
        }


    }

}
