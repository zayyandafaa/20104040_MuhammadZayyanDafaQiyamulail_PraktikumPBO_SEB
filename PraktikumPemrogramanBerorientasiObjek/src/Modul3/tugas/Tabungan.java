package Modul3.tugas;

public class Tabungan {
    private int saldo = 0;
    private boolean status;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public int simpanUang(int jumlah){
        return saldo = saldo + jumlah;
    }

    public boolean ambiluang(int jumlah){
        if (saldo - jumlah < 0){
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }
}

