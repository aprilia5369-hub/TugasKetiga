/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overLoadRide;

/**
 *
 * @author ACER
 */

public class mobil extends Kendaraan {

    @Override
    public void Kendaraan(String merk, int kecepatan) {
        System.out.println(merk + " berjalan dengan kecepatan : " + kecepatan + "km/jam" );
    }

    @Override
    public void Kendaraan(String merk) {
        System.out.println("Merk kendaraan : " + merk);
    }

    @Override
    public void Kendaraan() {
        System.out.println("Ini adalah kendaraan pribadi");
    }

        public static void main(String[] args) {
        mobil pribadi = new mobil ();
        pribadi.Kendaraan();
        pribadi.Kendaraan("Xpander");
        pribadi.Kendaraan("Xpander", 100);
    }
}
