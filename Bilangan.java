/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat58;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas Bilangan
public class Bilangan {
    //variabel
    private int x;
    private int y;

    // Konstruktor dengan x = 3 & y = 4
    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }
    //metode get
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
// Kelas JumlahBilangan turunan dari kelas bilangan
class JumlahBilangan extends Bilangan {
    //metode tampilhasiljumlah
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        //menampilkan hasiljumlah
        System.out.println("Hasil Jumlah = " + hasilJumlah);
    }
}
// Kelas SelisihBilangan turunan dari kelas bilangan
class SelisihBilangan extends Bilangan {
    //metode tampilselisih
    public void tampilSelisih() {
        int selisih = super.getX() - super.getY();
        //menampilkan hasil selisih
        System.out.println("Hasil Selisih " + super.getX()+ " - " + super.getY() + " = " + selisih);
    }
    //metode menjalankan program
    public static void main(String[] args) {
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        jumlahBilangan.tampilHasilJumlah();
        SelisihBilangan selisihBilangan = new SelisihBilangan();
        selisihBilangan.tampilSelisih();
    }
    
}
