import java.util.Scanner;

public class NilaiMahasiswa18 {

    public static Scanner sc = new Scanner(System.in);

    public static void isianArray(int[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.printf("Value no %d : ", (i+1));
            value[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.printf("Value no %d : %d %n", (i+1), value[i]);
        }
    }
    
    public static int hitTot(int[] value) {
        int total = 0;
        for (int item : value) {
            total += item;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Many student : ");
        int length = sc.nextInt();

        int[] value = new int[length];

        isianArray(value);
        tampilArray(value);

        int total = hitTot(value);

        System.out.printf("Total: %d", total);
    }
}
