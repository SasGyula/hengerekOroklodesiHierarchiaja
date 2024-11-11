package hu.szamalk.modell;

public class MertaniHenger{
    private int hengerDarab;
    private double sugar;
    private double magassag;


    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public int getHengerDarab() {
        return hengerDarab;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public void terfogat() {

    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "hengerDarab=" + hengerDarab +
                ", sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
