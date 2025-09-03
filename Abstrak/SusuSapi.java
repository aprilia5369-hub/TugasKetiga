/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author ACER
 */
public class SusuSapi extends MinumanSehat {

    public SusuSapi(String nama) {
        super(nama);
    }

    @Override
    public void manfaat() {
        System.out.println(nama + "Meningkatkan kekuatan tulang dan kesehatan tubuh.");
    }

    @Override
    public void deskripsi() {
        System.out.println(nama + "Susu segar yang kaya kalsium dan protein");
    }

    public static void main(String[] args) {
        SusuSapi putih = new SusuSapi ("Susu Putih ");
        putih.deskripsi();
        putih.manfaat();
    }
    
}
