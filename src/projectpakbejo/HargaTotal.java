/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo;

/**
 *
 * @author Lenovo
 */
public class HargaTotal {
    /*atribut*/
    int sisiA, sisiB, isiBox, luasArea = 1000000, luasBox, banyakBox, hargaPerBox;
    /*methods*/
    void hitungLuasPerBox(){
        int luas;
        luas = this.sisiA * this.sisiB * this.isiBox;
        this.luasBox = (int)luas;
        System.out.println("Luas keramik per Box adalah " + luasBox);
    }
    void hitungBox(){
        float jumlah = (float)this.luasArea / (float)this.luasBox;
        double jumlahBox = Math.ceil(jumlah);
        this.banyakBox = (int)jumlahBox;
        System.out.println("Jumlah Box yang dibutuhkan adalah " + banyakBox);
    }
    void totalHarga(){
        int total = this.banyakBox * this.hargaPerBox;
        System.out.println("Total Harga keramik adalah Rp." + total);
    }
}
