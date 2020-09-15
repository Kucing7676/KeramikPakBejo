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
public class ProjectPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*instansiasi*/
        /*Keramik A*/
        HargaTotal k1 = new HargaTotal();
        k1.sisiA = 30;
        k1.sisiB = 30;
        k1.isiBox = 10;
        k1.hargaPerBox = 54000;
        System.out.println("");
        System.out.println("Keramik A");
        k1.hitungLuasPerBox();
        k1.hitungBox();
        k1.totalHarga();
        /*Keramik B*/
        HargaTotal k2 = new HargaTotal();
        k2.sisiA = 40;
        k2.sisiB = 40;
        k2.isiBox = 5;
        k2.hargaPerBox = 65000;
        System.out.println("");
        System.out.println("Keramik B");
        k2.hitungLuasPerBox();
        k2.hitungBox();
        k2.totalHarga();
        /*Keramik C*/
        HargaTotal k3 = new HargaTotal();
        k3.sisiA = 30;
        k3.sisiB = 40;
        k3.isiBox = 8;
        k3.hargaPerBox = 60000;
        System.out.println("");
        System.out.println("Keramik C");
        k3.hitungLuasPerBox();
        k3.hitungBox();
        k3.totalHarga();
    }
    
}
