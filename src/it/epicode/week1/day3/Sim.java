public class Sim {
    private final String numeroDiTelefono;
    private double creditoDisponibile;
    private final double costoPerSecondo = 1.20;

    private int numeroChiamate=0;
    private String[] chiamate = new String[5];

    public Sim(String numeroDiTelefono, int creditoDisponibile) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.creditoDisponibile = creditoDisponibile;
    }

    public boolean telefonata(double secondi, String numeroChiamato) {
        double costoChiamata;
        costoChiamata = secondi * this.costoPerSecondo;
        if (creditoDisponibile <= 0) {
            System.out.println("credito insufficiente");
            return false;
        } else {
            this.chiamate[(this.numeroChiamate%this.chiamate.length)]="durata chiamata: " + (secondi/60) + " numero chiamato: "+ numeroChiamato;
            this.numeroChiamate++;
            this.creditoDisponibile = this.creditoDisponibile - costoChiamata;
            System.out.println("il costo della chiamata è " + costoChiamata);
            System.out.println("il tuo credito disponibile aggiornato è " + this.creditoDisponibile);
            return true;
        }
    }

    public void stampaDatiSim() {
        System.out.println("nTelefono: " + this.numeroDiTelefono + " costo per secondo: " + this.costoPerSecondo + " credito disponibile: " + this.creditoDisponibile);
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public double getCostoPerSecondo() {
        return costoPerSecondo;
    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setCreditoDisponibile(int creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public String[] getChiamate() {
        return chiamate;
    }
}
