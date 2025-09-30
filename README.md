# Posttest-PBO-4
Nama : Muhammad Rifqi Jastiartha Nim:2409116117

# 🎟️ Sistem Manajemen Penjualan Tiket Konser

**Post Test 4 - Pemrograman Berorientasi Objek (Java)**

## 📌 Deskripsi Program

Program ini merupakan simulasi **sistem manajemen penjualan tiket konser** berbasis Java dengan pendekatan **Object-Oriented Programming (OOP)**.
Pengguna dapat menambahkan tiket konser (Regular & VIP), melihat daftar tiket, mengupdate, menghapus, serta mencari tiket berdasarkan nama konser.

Program dikembangkan berbasis **menu interaktif (CLI)** dengan `Scanner`, data tiket disimpan di **ArrayList**, dan seluruh logika CRUD dipisahkan sesuai package (MVC sederhana).

---

## 📂 Struktur Project

```
konserMVC/
 └── src/
      ├── main/
      │    └── Main.java          # Menu interaktif untuk user
      ├── model/
      │    ├── Tiket.java         # Abstract class (abstraction, overloading)
      │    ├── Tiketregular.java  # Subclass (override method tampilkanInfo)
      │    └── Tiketvip.java      # Subclass (override method tampilkanInfo)
      └── service/
           ├── CrudService.java   # Interface (kontrak CRUD)
           └── TiketService.java  # Implementasi logika CRUD
```

---

## ⚙️ Fitur Program

1. **Tambah Tiket** (Regular / VIP)
2. **Lihat Semua Tiket** (menampilkan daftar tiket dengan detail sesuai jenisnya)
3. **Update Tiket**
4. **Hapus Tiket**
5. **Cari Tiket** berdasarkan keyword nama konser
6. **Keluar** dari program

---

## 🧩 Penerapan Konsep OOP (Post Test 4)

* **Abstraction**

  * `Tiket.java` dibuat sebagai **abstract class** dengan method abstrak `tampilkanInfo()`.
* **Polymorphism (Overriding)**

  * `Tiketregular` dan `Tiketvip` masing-masing **override** method `tampilkanInfo()`.
* **Polymorphism (Overloading)**

  * Method `cekStok()` di `Tiket.java` dibuat dalam 2 versi:

    * `cekStok()` → cek apakah stok masih ada.
    * `cekStok(int jumlah)` → cek apakah stok cukup untuk jumlah tertentu.
* **Interface**

  * `CrudService.java` berisi kontrak CRUD.
  * `TiketService.java` mengimplementasikan interface ini.
* **MVC sederhana**

  * `model/` → class & abstraksi data tiket.
  * `service/` → logika bisnis CRUD.
  * `main/` → interaksi user (menu).

---

## ▶️ Cara Menjalankan Program

1. Clone repository atau download source code.

   ```bash
   git clone https://github.com/username/konserMVC.git
   cd konserMVC/src
   ```
2. Compile semua file Java:

   ```bash
   javac main/Main.java
   ```
3. Jalankan program:

   ```bash
   java main.Main
   ```
4. Ikuti menu interaktif di terminal.

---

## 📊 Contoh Output

```
=== Sistem Manajemen Penjualan Tiket Konser ===
1. Tambah Tiket
2. Lihat Tiket
3. Update Tiket
4. Hapus Tiket
5. Cari Tiket
6. Keluar
Pilih menu: 1
Pilih jenis tiket:
1. Regular
2. VIP
3. Keluar
```

Contoh daftar tiket setelah ditambahkan:

```
1. [REGULER] Konser Hindia | 15-11-2025 | Rp250000.0 | Stok: 100
2. [VIP] Konser ERK | 10-12-2025 | Rp500000.0 | Stok: 50 | Fasilitas: Meet & Greet
```

Contoh overloading (cek stok):

```
Cek stok tiket pertama: true
Cek stok tiket pertama untuk 5 tiket: true
```

---

