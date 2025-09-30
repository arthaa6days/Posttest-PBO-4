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
public class Tiketvip extends Tiket {
    private String fasilitas;

    public Tiketvip(String namaKonser, String tanggal, double harga, int stok, String fasilitas) {
        super(namaKonser, tanggal, harga, stok);
        this.fasilitas = fasilitas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[VIP] " + namaKonser + " | " + tanggal + " | Rp" + harga +
                " | Stok: " + stok + " | Fasilitas: " + fasilitas);
    }
}

    

