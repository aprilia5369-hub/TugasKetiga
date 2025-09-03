/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author ACER
 */
public class Kopi extends MinumanTidakSehat implements BisaDiminum, Menyegarkan, Berenergi {

    public Kopi(String nama) {
        super(nama);
    }

    @Override
    public void minum() {
        System.out.println(nama + " diminum");
    }

    @Override
    public void segar() {
        System.out.println(nama + " menyegarkan");
    }

    @Override
    public void energi() {
        System.out.println(nama + " memberikan energi");
    }

    @Override
    public void efekSamping() {
        System.out.println(nama+ " konsumsi berlebihan menyebabkan gangguan tidur");
    }

    @Override
    public void deskripsi() {
        System.out.println("Kopi dengan gula tambahan, nikmat tapi tidak sehat");
    }
    
    public static void main(String[] args) {
        Kopi hitam = new Kopi ("Kopi Hitam");
        hitam.minum();
        hitam.segar();
        hitam.energi();
        hitam.deskripsi();
        hitam.efekSamping();
    }

    
}
