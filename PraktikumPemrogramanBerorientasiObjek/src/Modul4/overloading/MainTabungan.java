package Modul4.overloading;

public class MainTabungan {
    public static void main(String[] args) {
        Tabungan zhongli = new Tabungan("zhongli", 8180);
        Tabungan tarta = new Tabungan("childe", 8082, 5000000, 1234);

        System.out.println("Isi Saldo Mr." + zhongli.getNama() + " adalah " + zhongli.getSaldo());
        System.out.println("Isi Saldo Mr." + tarta.getNama() + " adalah " + tarta.getSaldo());

        System.out.println("No.pin Mr." + zhongli.getNama() + " adalah " + zhongli.getPin());
        System.out.println("No.pin Mr." + tarta.getNama() + " adalah " + tarta.getPin());
    }
}
