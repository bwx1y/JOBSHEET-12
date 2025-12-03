import java.util.Scanner;

public class Kubus18 {
    public static double WideCube(int s) {
        return 6 * Math.pow(s, 2);
    }

    public static double VolumeCube(int s) {
        return Math.pow(s, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side Cube : ");
        int s = sc.nextInt();

        double wide = WideCube(s);
        double volume = VolumeCube(s);

        System.out.printf("Wide : %.2f %nVolume: %.2f", wide, volume);
    }
}
