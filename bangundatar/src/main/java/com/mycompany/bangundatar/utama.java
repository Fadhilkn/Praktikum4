/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;

/**
 *
 * @author USER
 */
public class utama {
    
    public static void main(String[] args){
        
        // Buat objek Bangundatar, persegi, segitiga, lingkaran
        Bangundatar bangundatar = new Bangundatar();
        
        persegi persegi = new persegi(4);
        
        segitiga segitiga = new segitiga(8, 6);
        
        lingkaran lingkaran = new lingkaran(30);
        
        bangundatar.luas();
        bangundatar.keliling();
        
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());
    }
}
