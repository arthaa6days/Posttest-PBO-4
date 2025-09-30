package main;

import java.util.Scanner;
import model.Tiket;
import model.Tiketvip;
import model.Tiketregular;
import service.TiketService;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TiketService service = new TiketService();
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Penjualan Tiket Konser ===");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Lihat Tiket");
            System.out.println("3. Update Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Cari Tiket");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {
                System.out.println("❌ Input harus berupa angka!");
                input.next();
            }
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Pilih jenis tiket:");
                    System.out.println("1. Regular");
                    System.out.println("2. VIP");
                    System.out.println("3. Keluar");
                    int jenis = input.nextInt();
                    input.nextLine();
                    
                     if (jenis == 3) {
                      System.out.println("↩️ Kembali ke menu utama...");
                       continue; // lompat ke menu utama
                       }


                    System.out.print("Masukkan nama konser: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan tanggal konser (dd-mm-yyyy): ");
                    String tanggal = input.nextLine();
                    
                    System.out.print("Masukkan harga tiket: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("❌ Harga harus berupa angka!");
                        input.next();
                    }
                    double harga = input.nextDouble();
                    input.nextLine();

                    System.out.print("Masukkan stok tiket: ");
                    while (!input.hasNextInt()) {
                        System.out.println("❌ Stok harus berupa angka!");
                        input.next();
                    }
                    int stok = input.nextInt();
                    input.nextLine();

                    if (jenis == 2) {
                        System.out.print("Masukkan fasilitas VIP: ");
                        String fasilitas = input.nextLine();
                        service.tambahTiket(new Tiketvip(nama, tanggal, harga, stok, fasilitas));
                    } else {
                        service.tambahTiket(new Tiketregular(nama, tanggal, harga, stok));
                    }
                    break;

                case 2:
                    service.tampilkanTiket();
                    if (!service.getAllTiket().isEmpty()) {
                     Tiket tiketPertama = service.getAllTiket().get(0);
                     System.out.println("Cek stok tiket pertama: " + tiketPertama.cekStok());
                     System.out.println("Cek stok tiket pertama untuk 5 tiket: " + tiketPertama.cekStok(5));
                     break;
                    }

                case 3:
                    service.tampilkanTiket();
                    System.out.print("Pilih nomor tiket yang ingin diupdate: ");
                    int idxUpdate = input.nextInt() - 1;
                    input.nextLine();

                    System.out.print("Masukkan nama konser baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan tanggal konser baru: ");
                    String tanggalBaru = input.nextLine();
                    
                    System.out.print("Masukkan harga tiket baru: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("❌ Harga harus berupa angka!");
                        input.next();
                    }
                    double hargaBaru = input.nextDouble();
                    input.nextLine();

                    System.out.print("Masukkan stok tiket baru: ");
                    while (!input.hasNextInt()) {
                        System.out.println("❌ Stok harus berupa angka!");
                        input.next();
                    }
                    int stokBaru = input.nextInt();
                    input.nextLine();

                    service.updateTiket(idxUpdate, new Tiketregular(namaBaru, tanggalBaru, hargaBaru, stokBaru));
                    break;

                case 4:
                    service.tampilkanTiket();
                    System.out.print("Pilih nomor tiket yang ingin dihapus: ");
                    int idxHapus = input.nextInt() - 1;
                    input.nextLine();
                    service.hapusTiket(idxHapus);
                    break;

                case 5:
                    System.out.print("Masukkan keyword nama konser: ");
                    String keyword = input.nextLine();
                    service.cariTiket(keyword);
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    break;

                default:
                    System.out.println("❌ Menu tidak valid.");
            }
        } while (pilihan != 6);

        input.close();
    }
}
