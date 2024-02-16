import java.util.Scanner;
import java.lang.Math;

public class bangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n.:: BANGUN RUANG ::.\n");

        System.out.println(".:: PILIH BANGUN RUANG ::.\n");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("\nKetikkan angka: ");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println("\nMasukkan nilai panjang kubus: ");
                float sisi = input.nextFloat();
                System.out.println("\nLuas permukaan Kubus adalah: " + 6 * sisi);
                System.out.println("Volume Kubus adalah: " + sisi * sisi * sisi);
                System.out.println("\n!! Terimakasih Telah menggunakan Program saya !!\n");

                break;
            case 2:
                System.out.println("\nMasukkan nilai panjang balok: ");
                float panjangBalok = input.nextFloat();
                System.out.println("Masukkan nilai lebar balok: ");
                float lebarBalok = input.nextFloat();
                System.out.println("Masukkan nilai tinggi balok: ");
                float tinggiBalok = input.nextFloat();
                System.out.println("\nLuas permukaan Balok adalah: " + panjangBalok * lebarBalok * tinggiBalok);
                System.out.println("Volume Balok adalah: "
                        + 2 * (panjangBalok * lebarBalok + lebarBalok * tinggiBalok + panjangBalok * tinggiBalok));
                System.out.println("\n!! Terimakasih Telah menggunakan Program saya !!\n");

                break;
            case 3:
                System.out.println("\nMasukkan nilai jari-jari bola: ");
                float jariJari = input.nextFloat();
                System.out.println("\nLuas permukaan bola adalah: " + 4 * Math.PI * jariJari * jariJari);
                System.out.println("Volume bola adalah: " + 4 / 3 * Math.PI * jariJari * jariJari * jariJari);
                System.out.println("\n!! Terimakasih Telah menggunakan Program saya !!\n");

                break;

            default:
                System.out.println("Masukkan angka tidak valid!!");
                break;
        }
        input.close();

    }
}
