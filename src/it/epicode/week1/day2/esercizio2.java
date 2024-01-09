package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero=scanner.nextInt();
        String numeroInLettere=convertiNumeroInLettere(numero);
        if (numero>=0&&numero<=3) {
            System.out.println("il numero che hai inserito è " + numeroInLettere);
        }else{
            System.out.println("il numero non è supportato");
        }
    }
    static String convertiNumeroInLettere(int numero){
        switch (numero){
            case 0:
                return "zero";

            case 1:
                return"uno";

            case 2:
                return "due";

            case 3:
                return "tre";

            default:return "error";
        }
    }
}
