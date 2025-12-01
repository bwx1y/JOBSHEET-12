package Pertemuan14;

import java.util.Scanner;

public class hitungTotalHarga18 {
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

    public static int hitungTotalHarga (int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int diskon = hargaTotal * 50 / 100;
            hargaTotal -= diskon;
            System.out.println("Kode promo berlaku: Diskon 50%! Potongan Rp " + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int diskon = hargaTotal * 30 / 100;
            hargaTotal -= diskon;
            System.out.println("Kode promo berlaku: Diskon 30%! Potongan Rp " + diskon);
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
