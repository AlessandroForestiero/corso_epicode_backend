package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println(virgola(stringa));
    }


    static String virgola(String a) {
        int i = 0;
        String result="";
        if(a.equals(":q"))
        {
            return "bubu";
        }else {
            while (i < a.length()) {
                result += a.charAt(i) + ",";
                i++;

            }

            return result;
        }
    }
}
