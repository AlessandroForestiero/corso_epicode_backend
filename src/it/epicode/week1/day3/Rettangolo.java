public class Rettangolo {


    private int altezza;

    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int perimetro() {
        return (this.altezza * 2) + (this.larghezza * 2);
    }

    public int area() {
        return this.altezza * this.larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

}
