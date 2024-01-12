package it.epicode.week1.progetto;

public class Video extends ElementoMultimediale implements Riproducibile {


    private int volume;
    private int luminosita;

    public Video(String titolo, int volume, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
    }


    public void aumentaLuminosita() {
        this.luminosita++;

    }


    public void abbassaLuminosita() {
        if (this.luminosita > 0) {
            this.luminosita--;
        }
    }


    public void alzaVolume() {
        this.volume++;
    }


    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }

    }

    @Override
    public void play() {
        String repeated = new String(new char[this.volume]).replace("\0", "!");
        String repeatedDue = new String(new char[this.luminosita]).replace("\0", "*");
        System.out.println(this.getTitolo() + repeated + repeatedDue);

    }

    public int getVolume() {
        return volume;
    }


    public int getLuminosita() {
        return luminosita;
    }


}
