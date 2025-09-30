/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author Tuf Gaming
 */
public abstract class Tiket {
   protected String namaKonser;
    protected String tanggal;
    protected double harga;
    protected int stok;

    public Tiket(String namaKonser, String tanggal, double harga, int stok) {
        this.namaKonser = namaKonser;
        this.tanggal = tanggal;
        this.harga = harga;
        this.stok = stok;
    }

    // Abstract method → wajib dioverride oleh subclass
    public abstract void tampilkanInfo();

    // Overloading
    public boolean cekStok() {
        return stok > 0;
    }

    public boolean cekStok(int jumlah) {
        return stok >= jumlah;
    }

    // Getter & Setter
    public String getNamaKonser() { return namaKonser; }
    public String getTanggal() { return tanggal; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }
}
