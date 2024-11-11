package hu.szamalk.modell;

public class TomorHenger extends MertaniHenger{
    private double fajsuly;
    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = 1;
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly(){
        return 0.0;
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }

}
