package Modul4.praktikum;

public class MainClass {

    public static void main(String[] args) {
//        Tabungan tabungan1 = new Tabungan();
//        Tabungan tabungan2 = new Tabungan(20000);

        Tabungan tabungan = new Tabungan("Ei", 8110, 50000, 100110);

        System.out.println("Nama\t: " + tabungan.getNama());
        System.out.println("No Rekening\t: " + tabungan.getNoRekening());
        System.out.println("Saldo\t: " + tabungan.getSaldo());
        System.out.println("Pin\t: " + tabungan.getPin());

    }
}
