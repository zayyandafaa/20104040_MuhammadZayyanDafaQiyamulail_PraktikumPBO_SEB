package Modul3.praktikum.bank;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambilUang(int jumlah){
        //Substraction assignment
        //saldo = saldo - jumlah;
        saldo -= jumlah;
    }

    public int getSaldo(){
        return saldo;
    }
}
