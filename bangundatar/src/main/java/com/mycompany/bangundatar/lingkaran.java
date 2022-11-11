/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;

/**
 *
 * @author USER
 */
public class lingkaran extends Bangundatar {
    //buat variabel lingkaran
    int r;
    
    public lingkaran(int r){
        this.r = r;
    }
    
    public float luas(){
        return (float) (Math.PI * r * r);
    }
    
    public float keliling(){
        return (float) (2 * Math.PI *r);
    }
    
}
