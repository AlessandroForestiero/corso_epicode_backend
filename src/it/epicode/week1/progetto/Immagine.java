package it.epicode.week1.progetto;

public class Immagine extends ElementoMultimediale {



    private int luminosita;

    public Immagine (String titolo,int luminosita){
        super(titolo);
        this.luminosita=luminosita;
    }
    public void show(){
        String repeated = new String(new char[this.luminosita]).replace("\0", "*");
        System.out.println(getTitolo()+repeated);
    }

    public void aumentaLuminosita() {
        this.luminosita++;
    }


    public void abbassaLuminosita() {
    if(this.luminosita>0){
        this.luminosita--;
    }
    }
    public int getLuminosita() {
        return luminosita;
    }
}
