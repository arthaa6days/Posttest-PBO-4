/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Tiket;

/**
 *
 * @author Tuf Gaming
 */
public class TiketService implements CrudService {
    private final List<Tiket> daftarTiket = new ArrayList<>();

    @Override
    public void tambahTiket(Tiket tiket) {
        daftarTiket.add(tiket);
        System.out.println("✅ Tiket berhasil ditambahkan!");
    }

    @Override
    public void tampilkanTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("❌ Belum ada tiket yang tersedia.");
        } else {
            int no = 1;
            for (Tiket t : daftarTiket) {
                System.out.print(no + ". ");
                t.tampilkanInfo(); // Polymorphism (Overriding)
                no++;
            }
        }
    }

    @Override
    public void updateTiket(int index, Tiket tiket) {
        if (index >= 0 && index < daftarTiket.size()) {
            daftarTiket.set(index, tiket);
            System.out.println("✅ Tiket berhasil diupdate!");
        } else {
            System.out.println("❌ Nomor tiket tidak valid!");
        }
    }

    @Override
    public void hapusTiket(int index) {
        if (index >= 0 && index < daftarTiket.size()) {
            daftarTiket.remove(index);
            System.out.println("✅ Tiket berhasil dihapus!");
        } else {
            System.out.println("❌ Nomor tiket tidak valid!");
        }
    }

    @Override
    public void cariTiket(String keyword) {
        boolean ketemu = false;
        for (Tiket t : daftarTiket) {
            if (t.getNamaKonser().toLowerCase().contains(keyword.toLowerCase())) {
                t.tampilkanInfo();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("❌ Tiket tidak ditemukan.");
        }
    }

    @Override
    public List<Tiket> getAllTiket() {
        return daftarTiket;
    }
    
}

    

