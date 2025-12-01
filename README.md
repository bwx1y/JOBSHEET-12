# JOBSHEET 12

## Percobaan 2.1

1. Apakah fungsi tanpa parameter selalu harus bertipe void?

tidak fungsi tanpa parameter tidak harus ber type void bisa bertype contoh string, dll.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!

bisa fungsi hanya di gunakan untuk merapikan code saja dan bisa di gunakan utuk reusable, perubahan code 
```java
package Pertemuan14;

public class Kafe18 {
    public static void main(String[] args) {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("=================================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
}
```

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.

- Kode lebih rapi dan terstruktur
- Memudahkan pemeliharaan (maintenance)
- Menghindari pengulangan kode (reusability)
- Lebih mudah dikembangkan
- Mendukung konsep modular programming

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

- Program dijalankan → JVM (Java Virtual Machine) mencari dan mengeksekusi fungsi main() sebagai titik awal program.
- Masuk ke fungsi main() → Eksekusi berjalan melalui baris demi baris di dalam main().
- Baris Menu(); dipanggil → JVM memanggil fungsi Menu() yang berada di kelas yang sama.
- Masuk ke fungsi Menu() → Program berpindah dari main() ke tubuh fungsi Menu().
- Menjalankan semua perintah System.out.println() → Setiap baris pada fungsi Menu() dicetak ke layar secara berurutan (judul menu, daftar menu, garis pemisah, dan pesan terakhir).
- Selesai menjalankan Menu() → Setelah semua perintah selesai, eksekusi kembali ke fungsi main().
- Program selesai → Karena tidak ada perintah lain di dalam main(), program berhenti.

## Percobaan 2.2

1. Apakah kegunaan parameter di dalam fungsi?

Parameter memungkinkan kita mengirim nilai atau informasi dari luar fungsi ke dalam fungsi.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?

parameter nama pelanggan di gunakan untuk menampilkan sambutan lalu nama pelangan di setiap pelanggan, parameter isMember di gunakan utuk menentukan apakah pelanggan mendapatkan diskon

3. Apakah parameter sama dengan variabel? Jelaskan.

tidak sama karena paremeter adalah variable kusus yang di gunakan untuk menerima nilai dari pemanggil fungsi dan variable adalah tempat untuk menyimpan data dalam progam

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?

Parameter isMember pada fungsi Menu() bekerja sebagai penentu kondisi (boolean) yang menentukan apakah pelanggan akan mendapatkan pesan diskon member atau tidak, ``jika isMember = true`` akan menampilkan ``Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!`` dan ketika false maka tidak akan menampilkan itu

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?

Jika kamu memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember, maka program akan menghasilkan error kompilasi (compile-time error).

6.  Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.

aku melakukan perubahan untuk ini
```
public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, "+ namaPelanggan + " !");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("=========================");

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo berlaku: Diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo berlaku: Diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("Silakan pilih menu yang Anda inginkan.");
}
```

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.

berhasil di jalankan dan memberikan ``Kode promo berlaku: Diskon 30%!``

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

Ya, penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca, fleksibel, dan mudah dikembangkan dibandingkan menulis nilai-nilai tersebut langsung di dalam fungsi. karena kode lebih fleksibel, Memudahkan pemeliharaan, kode lebih rapi dan modular, Mendukung pengembangan program

## Percobaan 2.3

1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.

- Fungsi membutuhkan nilai kembalian (return value)

Suatu fungsi membutuhkan nilai kembalian jika hasil dari fungsi tersebut akan digunakan atau disimpan untuk keperluan lain, misalnya perhitungan, logika, atau ditampilkan ke pengguna.

- Fungsi tidak perlu mengembalikan nilai (void)

Fungsi tidak perlu nilai kembalian jika hanya melakukan aksi atau efek samping (misalnya menampilkan informasi ke layar, menulis file, atau mengubah variabel global) dan tidak perlu menghasilkan nilai untuk digunakan di tempat lain.

2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.

type data yang dikembalikan adalah int dan lalu dua type data yang di gunakan adalah ber type int semua 

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.

--

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?

-- 

## Percobaan 2.4

1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!

String... namaPengunjung adalah varargs (variable arguments), Artinya fungsi dapat menerima 0 atau lebih argumen bertipe String.

2. Modifikasi method daftarPengunjung menggunakan for-each loop.

--

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!

tidak bisa, Di Java, hanya boleh ada satu varargs parameter dalam satu method, dan harus ditempatkan di akhir daftar parameter dan Jika ingin menerima tipe berbeda, harus menggunakan array atau tipe objek, atau membuat overload method.

4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?

Tidak akan terjadi error kompilasi atau runtime, karena Varargs dapat menerima 0 argumen. outputnya hanya akan berisi ``Daftar Nama Pengunjung:``

## Percobaan 2.5

1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok

- Program dijalankan
- Program mendeklarasikan variabel: ``int p, l, t, L, vol;``
- Program menampilkan pesan ke layar dan menunggu input pengguna
- Pengguna memasukkan nilai panjang
- Pengguna memasukkan nilai lebar 
- Pengguna memasukkan nilai tinggi
- Menghitung luas persegi panjang
- Menampilkan luas
- Menghitung volume balok
- Menampilkan volume balok
- Program selesai

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.

- program dijalankan
- Input pengguna: panjang = 4, lebar = 3, dan tinggi = 5.
- Menghitung luas persegi panjang Fungsi dipanggil Di dalam hitungLuas: Luas = 4 * 3 = 12.
- Menampilkan luas
- Fungsi dipanggil Hitung volume: volume = 12 * 5 = 60.
- Menampilkan volume
- Program selesai → Scanner ditutup, eksekusi berhenti.

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!

- Parameter digunakan jika fungsi membutuhkan data dari luar agar dapat menjalankan tugasnya.

Parameter memungkinkan fungsi menjadi fleksibel dan dapat digunakan ulang dengan data berbeda tanpa mengubah kode fungsi.
Jika fungsi tidak membutuhkan data dari luar, maka parameter tidak perlu.

- Nilai kembalian diperlukan jika hasil perhitungan atau informasi dari fungsi akan digunakan di tempat lain.

Fungsi yang mengembalikan nilai memungkinkan pemanggil menyimpan atau memproses hasilnya.
Jika fungsi hanya melakukan aksi, misalnya menampilkan sesuatu ke layar, nilai kembalian tidak perlu (void).

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5

- Fungsi menggunakan parameter ketika membutuhkan data dari luar agar dapat melakukan perhitungan atau aksi secara fleksibel.
- Fungsi boleh tanpa parameter jika tidak memerlukan input dari luar atau data sudah tersedia di dalam fungsi itu sendiri. Biasanya untuk aksi tetap, seperti menampilkan pesan statis.

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

- Fungsi memiliki nilai kembalian ketika hasil perhitungan atau informasi dari fungsi perlu digunakan di tempat lain, misalnya disimpan di variabel atau diproses lebih lanjut.
- Fungsi tidak perlu nilai kembalian (void) jika hanya melakukan aksi, misalnya menampilkan informasi atau memodifikasi variabel internal, tanpa perlu mengembalikan hasil ke pemanggil.
- 