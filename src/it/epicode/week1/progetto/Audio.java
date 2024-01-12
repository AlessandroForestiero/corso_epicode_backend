package it.epicode.week1.progetto;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private int volume;

    public Audio(String titolo, int volume) {
        super(titolo);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }else{
            System.out.println("raggiunto volume minimo");
        }
    }

    @Override
    public void play() {
        String repeated = new String(new char[this.volume]).replace("\0", "!");
        System.out.println(this.getTitolo() + repeated);
    }

}
