/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overLoadRide;

/**
 *
 * @author ACER
 */

public class Kendaraan {
    public void Kendaraan() {
        System.out.println("Ini kendaraan umum");
    }

    public void Kendaraan(String merk) {
        System.out.println("Merk kendaraan : " + merk);
    }

    public void Kendaraan(String merk, int kecepatan) {
       System.out.println(merk + " berjalan dengan kecepatan : " + kecepatan + "km/jam");
    }
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan ();
        k.Kendaraan();
        k.Kendaraan("Mitsubitsi");
        k.Kendaraan("Mitsubitsi", 80);
    }
}
