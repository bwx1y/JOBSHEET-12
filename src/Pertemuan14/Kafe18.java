package Pertemuan14;

public class Kafe18 {
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

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
        Menu("Andi", true, "DISKON30");
        Menu("Andi", true, "DISKON100");
    }
}
