package Klase1;
//Povrsina i obim.
//O = a + b + c
//P = ( a * ha ) / 2 = ( b * hb ) / 2 = ( c * hc ) / 2
//Klasa trougao ima 3 polja koji predstavljaju stranice: stranicaA, stranicaB, stranicaC.
// Vrednost stranica je tipa double.
// Napisati konstruktor, getter i setter metode za sve stranice i metode za racunanje obima i povrsine.

public class Trougao {
    private double a;
    private double b;
    private double c;

    public Trougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double obim() {
        double o = a + b + c;
        return o;
    }

    public double povrsina() {
        double ha = (a * Math.sqrt(3)) / 2;
        double p = (a * ha) / 2;
        return p;
    }
}


