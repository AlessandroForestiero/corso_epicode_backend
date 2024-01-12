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


    public void alzaVolume() {
        this.volume++;
    }


    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        } else {
            System.out.println("raggiunto volume minimo");
        }
    }

    @Override
    public void play() {
        String repeated = new String(new char[this.volume]).replace("\0", "!");
        for (int i = 0; i < Riproducibile.durata; i++) {
            System.out.println(this.getTitolo() + repeated);
        }
    }

}
