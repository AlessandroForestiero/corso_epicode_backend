package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        System.out.println("Inserisci una stringa");
        Scanner scanner=new Scanner(System.in);
        String a = scanner.nextLine();
        if(stringaPariDispari(a)==true) {


            System.out.println("la stringa è pari");
        }
        else {
            System.out.println("la stringa è dispari");
            ;
        }
        System.out.println("inserisci un anno");
        int anno=scanner.nextInt();
        if(annoBisestile(anno)==true){
            System.out.println("l'anno è bisestile");
        }else{
            System.out.println("l'anno non è bisestile");
        };
    }
    static boolean stringaPariDispari(String a) {
        if (a.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    static boolean annoBisestile(int a) {
        if (a % 4 == 0 || a % 100 == 0 && a % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
