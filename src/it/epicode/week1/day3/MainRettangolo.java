public class MainRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(50, 100);
        stampaRettangolo(rettangolo);
        stampaDueRettangoli(rettangolo, rettangolo);

    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("il perimetro del rettangolo è " + r.perimetro());
        System.out.println("l'area del rettangolo è " + r.area());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("il perimetro e l'aerea del rettangolo r1 sono rispettivamente " + r1.area() + " e " + r1.perimetro());
        System.out.println("il perimetro e l'aerea del rettangolo r2 sono rispettivamente " + r2.area() + " e " + r2.perimetro());
        System.out.println("la somma delle aree e dei perimetri sono rispettivamente " + (r1.area() + r2.area()) + " e " + (r1.perimetro() + r2.perimetro()));
    }
}
