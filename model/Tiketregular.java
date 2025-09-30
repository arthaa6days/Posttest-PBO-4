/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
/**
 *
 * @author Tuf Gaming
 */
public class Tiketregular extends Tiket {
    public Tiketregular(String namaKonser, String tanggal, double harga, int stok) {
        super(namaKonser, tanggal, harga, stok);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[REGULER] " + namaKonser + " | " + tanggal + " | Rp" + harga + " | Stok: " + stok);
    }
}


