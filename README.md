# 20104040_MuhammadZayyanDafaQiyamulail_PraktikumPBO_SEB
Praktikum Bergerak Orientasi

A. Dasar Teori
  	Penamaan identifier harus diawali dengan karakter unicode, tanda $ (dollar) atau tanda _ (underscore). Penamaan identifier ini bersifat casesensitive dan tidak dibatasi        panjang maksimum.
    
 1. Keyword dalam java
	Kata kunci adalah identifier yang telah dipesan untuk didefinisikan sebelumnya oleh Java untuk tujuan tertentu. Anda tidak dapat menggunakan keyword sebagai nama 	variabel, class, method.
	 
 2. Variabel
    	Variabel adalah item yang digunakan data untuk menyimpan pernyataan objek. Variabel memiliki tipe data dan nama. Tipe data 8 menandakan tipe nilai yang dapat dibentuk 		oleh variabel itu sendiri. Nama variabel harus mengikuti aturan untuk identifier. Berikut Aturan penamaan variable : 
	      a. Diawali dengan : huruf/abjad atau karakter mata uang atau underscore 	
	      b. Terdiri dari huruf/abjad, angka dan underscore 
	      c. Tidak boleh mengandung karakter khusus atau spasi 
	      d. Tidak boleh diawali dengan angka
	
 3. Casting and Promotion
	Casting diperlukan untuk mengkonversi dari suatu tipe ke tipe data yang lebih kecil panjang bitnya. Sedangkan promotion terjadi pada saat mengkonversi dari suatu 		tipe data ke tipe data yang lebih panjang bitnya. 

B. Penjelasan Kode

 1. Soal No 1
	  public class Tipe {  
        public static void main(String args[]) {  
            long p=2147483648l;  
			System.out.println(p);  
		 }  
	}
	
	Penjelasan :
	    Mengapa pada code long p = 2147483638 itu eror? Karena java membaca syntax dengan tipe data integer bukan tipe data long. Maka, jika kita akan menggunakan tipe data          integer maka kita akan menambahkan satu huruf "l" di belakang angka supaya java dapat membaca tipe data yang kita maksud, yaitu long.
	
 2. Soal no 2
	   public static void main(String[] args) {  
     int anakAyam = 10;  
	"Menggunakan tipe data integer anakAyam sama dengan 10"
  
	  System.out.print("Lagu Anak Ayam");  
	  while (anakAyam !=0){  
	      System.out.println(" ");  
		  System.out.println("Anak Ayam Turun " +anakAyam);  
		  anakAyam--;

"Syntax diatas menggunakan metode perulangan decrement. yaitu yang terus mengurang dari 10 hingga 1
 
	  if (anakAyam==0){  
          System.out.println("Mati 1 tinggal induknya " +anakAyam);  
  }else {  
         System.out.println("Mati 1 tinggal " +anakAyam);  
       }  
    }  
}

"syntax diatas menggunakan metode if else"

 3. Soal no 3
	  public class ABC {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
		    int inputData, hasil, a, b, c;  	
"diatas merupakan deklarasi variabel yang berisikan inputData yang menggunakan tipe data integer, lalu ada hasil, a, b, dan c"

		System.out.println("Masukan nilai yang akan di hitung");  
		inputData = input.nextInt();
"pada inputData = input.nextInt(); berfungsi untuk menyimpan inputan nilai pada variabel. Nilai dari variabel a, b dan c akan disimpan kedalam array a, b, dan c"
  
		for (int i = 1; i < inputData; i++) {  
        System.out.println("Masukkan nilai A" +1+ " = ");  
		a = input.nextInt();  
		System.out.print("Masukan nilai B" +i+ " = ");  
		b = input.nextInt();  
		System.out.print("Masukan nilai C" +i+ " = ");  
		c = input.nextInt();  
		hasil = a + b - c;  
		System.out.print("Hasil Dari A " +i+ "+ B " +i+ "- C " +i+ "adalah 		= " +hasil);  
		System.out.println();  
		}  
    }  
}

"menggunakan perulangan untuk penginputan nilai a, b, c. pada perulangan penginputan akan tergantung dari berapa nilai yang akan dimasukkan"
	
	
