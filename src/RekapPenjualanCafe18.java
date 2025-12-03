import java.util.Scanner;

public class RekapPenjualanCafe18 {
    public static Scanner sc = new Scanner(System.in);

    public static void input(String[] menu, int[][] value) {
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Nama Menu: ");
            menu[i] = sc.nextLine();
            sc.next();

            for (int j = 0; j < value[i].length; j++) {
                System.out.printf("Hari ke-%d :", (j + 1));

                value[i][j] = sc.nextInt();
            }
        }
    }

    public static void show(String[] menu, int[][] value) {
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("Menu: %s %n", menu[i]);

            for (int j = 0; j < value[i].length; j++) {
                System.out.printf("Hari ke-%d : %d", (j + 1), value[i][j]);
            }
        }
    }

    public static int topIndexMenu(int[][] value) {
        int max = 0;
        int index = -1;

        for (int i = 0; i < value.length; i++) {
            int total = 0;

            for (int j = 0; j < value[i].length; j++) {
                total += value[i][j];
            }

            if (total > max) {
                max = total;
                index = i;
            }
        }

        return index;
    }

    public static double[] average(int[][] value) {
        double[] result = new double[value.length];

        for (int i = 0; i < value.length; i++) {
            double total = 0;

            for (int j = 0; j < value[i].length; j++) {
                total += value[i][j];
            }

            total /= value.length;
            result[i] = total;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan banyak menu : ");
        int menuLength = sc.nextInt();

        System.out.print("Masukan jumlah hari : ");
        int valueLength = sc.nextInt();

        String[] menu = new String[menuLength];
        int[][] value = new int[menuLength][valueLength];

        input(menu, value);
        show(menu, value);

        int topIndex = topIndexMenu(value);
        System.out.printf("Menu terlaris dalam 7 hari adalah %s", menu[topIndex]);

        double[] average = average(value);
        for (int i = 0; i < average.length; i++) {
            System.out.printf("Menu %s : %.2f", menu[i], average[i]);
        }
    }
}
