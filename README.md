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

