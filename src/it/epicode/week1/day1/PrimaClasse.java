package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(moltiplica(3,6));
        System.out.println(concatena("ciao ",5));
        System.out.println("inserisci tre stringhe");
        String primaStringa=scanner.nextLine();
        String secondaStringa=scanner.nextLine();
        String terzaStringa=scanner.nextLine();
        System.out.println(primaStringa+' '+secondaStringa+' '+terzaStringa);
        System.out.println(terzaStringa+' '+secondaStringa+' '+primaStringa);

    System.out.println("inserisci lati rettangolo");
    double a=scanner.nextDouble();
    double b=scanner.nextDouble();
    System.out.println("Il perimetro del rettangolo è " + perimetroRettangolo(a,b));
    System.out.println("inserisci un numero");
    int x=scanner.nextInt();
    System.out.println(pariDispari(x));
    System.out.println("inserisci base triangolo");
    float base=scanner.nextFloat();
    System.out.println("inserisci altezza triangolo");
    float high=scanner.nextFloat();
    System.out.println("l'area del triangolo è "+ areaTriangolo(base,high));

    }
    static int moltiplica(int x,int y){
        return x*y;
    }
    static String concatena(String x,int y){
        return x+y;
    }
    static double perimetroRettangolo(double x,double y){
       return 2*x+2*y;
    }
    static int pariDispari(int x) {
        if (x % 2 == 0) return 0;
        else return 1;
    }
    static float areaTriangolo(float x,float y){
        return (x*y)/2;
    }
}
