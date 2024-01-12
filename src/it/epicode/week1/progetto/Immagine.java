package it.epicode.week1.progetto;

public class Immagine extends ElementoMultimediale implements Illuminabile{

    private int luminosita;

    public Immagine (String titolo,int luminosita){
        super(titolo);
        this.luminosita=luminosita;
    }
    public void show(){
        String repeated = new String(new char[this.luminosita]).replace("\0", "*");
        System.out.println(getTitolo()+repeated);
    }
    @Override
    public void aumentaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
    if(this.luminosita>0){
        this.luminosita--;
    }
    }
}
