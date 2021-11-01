package Modul3.praktikum.percobaan;

public class tabungan {
    private int saldo;

    public tabungan(int saldo) {
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



