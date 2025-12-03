import java.util.Scanner;

public class RekapPenjualanCafe18 {
    public static Scanner sc = new Scanner(System.in);

    public static void input(String[] menu, int[][] value) {
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("Nama Menu: %s %n", menu[i]);

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
        String[] menu = {"Kopi", "Teh", "Es kelapa muda", "Roti bakar", "Gorengan"};
        int[][] value = new int[5][7];

        input(menu, value);
        show(menu, value);

        int topIndex = topIndexMenu(value);
        System.out.printf("Menu terlaris dalam 7 hari adalah %s %n", menu[topIndex]);

        double[] average = average(value);
        for (int i = 0; i < average.length; i++) {
            System.out.printf("Menu %s : %.2f %n", menu[i], average[i]);
        }
    }
}
