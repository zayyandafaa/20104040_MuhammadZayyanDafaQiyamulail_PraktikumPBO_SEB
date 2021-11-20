package Modul2.praktikum;

public class Main {
    public static void main(String[] args) {

        //Deklarasi objek dari class Modifier
        Modifier modif = new Modifier();
        Modifier modif2 = new Modifier();
        Modifier modif3 = new Modifier();

        System.out.println(
                modif.angkaNon
        );
        System.out.println(
                modif.angkaPublic
        );
        System.out.println(
                modif.angkaProtected
        );
        modif.printAngkaPrivate();


    }
}

