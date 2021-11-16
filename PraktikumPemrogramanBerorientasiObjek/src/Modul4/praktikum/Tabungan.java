package Modul4.praktikum;

public class Tabungan {

    // mendeklarasikan attribut
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    // constructor
    public Tabungan(String nama, int noRekening, int saldo, int pin){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    // @Overloading
    public String getNama() {
        return nama;
    }

    // Encapsulation
    public int getSaldo() {
        return saldo;
    }

    public int getNoRekening() {
        return noRekening;
    }

    // Encapsulation
    public int getPin() {
        return pin;
    }
}
