package Modul5.Tugas.Tabungan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public boolean ambilUang(int jumlah){
        if (jumlah <= saldo){
            saldo-=jumlah;
            return true;
        }else {
            return false;
        }
    }
    public void simpanUang(int jumlah){
        saldo+=jumlah;
    }
}


