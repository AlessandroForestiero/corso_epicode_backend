package it.epicode.week1.progetto;

public class Video extends ElementoMultimediale implements Riproducibile, Illuminabile {


    private int volume;
    private int luminosita;

    public Video(String titolo, int volume, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.luminosita = luminosita;
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

    @Override
    public void alzaVolume() {
    this.volume++;
    }

    @Override
    public void abbassaVolume() {
        if(this.volume>0){
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

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
