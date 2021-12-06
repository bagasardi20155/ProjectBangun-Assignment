/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author Predator
 */
public class MainClass {
    
        public static void main(String[] args) {
            //BangunDatar b1 = new BangunDatar();
            Persegi p = new Persegi();
            Lingkaran l = new Lingkaran();
            PersegiPanjang pp = new PersegiPanjang();
            
            Tabung t = new Tabung();
            Balok b = new Balok();
            Bola bl = new Bola();
            
            //persegi
            p.sisi = 5;
            System.out.println("\nPersegi dengan panjang sisi " + p.sisi);
            p.hitungLuas();
            p.hitungKeliling();
            p.tampilHasil();
            
            //lingkaran
            l.jarijari = 10;
            System.out.println("\nLingkaran dengan panjang jari - jari " + l.jarijari);
            l.hitungLuas();
            l.hitungKeliling();
            l.tampilHasil();
            
            //persegi panjang
            pp.lebar = 4;
            pp.panjang = 5;
            System.out.println("\nPersegi Panjang dengan panjang " + pp.panjang + " dan lebar " + pp.lebar);
            pp.hitungLuas();
            pp.hitungKeliling();
            pp.tampilHasil();
            
            //tabung
            t.jarijari = 10;
            t.tinggi = 10;
            System.out.println("\nTabung dengan panjang jari - jari " + t.jarijari + " dan tinggi " + t.tinggi);
            t.hitungVolume();
            t.hitungLuasPermukaan();
            t.tampilHasil();
            
            //balok
            b.lebar = 3;
            b.panjang = 4;
            b.tinggi = 5;
            System.out.println("\nBalok dengan panjang " + b.panjang + ", lebar " + b.lebar + ", dan tinggi " + b.tinggi);
            b.hitungVolume();
            b.hitungLuasPermukaan();
            b.tampilHasil();
            
            //bola
            bl.jarijari = 10;
            System.out.println("\nBola dengan panjang jari - jari " + t.jarijari);
            bl.hitungVolume();
            bl.hitungLuasPermukaan();
            bl.tampilHasil();
    }

}
