import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean loop = false;
        while (!loop) {
            System.out.println("\n===== BANGUN RUANG =====\n");
            System.out.println("== PILIH BANGUN RUANG ==\n");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.print("\nPilih operasi bangun ruang: ");
            int operation = input.nextInt();
            switch (operation) {
                case 1:
                    System.out.print("\nMasukkan nilai panjang sisi kubus: ");
                    float sisiKubus = input.nextFloat();
                    Kubus kubus = new Kubus(sisiKubus);
                    System.out.println("\nLuas permukaan Kubus adalah: " + kubus.hitungLuasPermukaan());
                    System.out.println("Volume Kubus adalah: " + kubus.hitungVolume());
                    break;
                case 2:
                    System.out.print("\nMasukkan nilai panjang balok: ");
                    float panjangBalok = input.nextFloat();
                    System.out.print("Masukkan nilai lebar balok: ");
                    float lebarBalok = input.nextFloat();
                    System.out.print("Masukkan nilai tinggi balok: ");
                    float tinggiBalok = input.nextFloat();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("\nLuas permukaan Balok adalah: " + balok.hitungLuasPermukaan());
                    System.out.println("Volume Balok adalah: " + balok.hitungVolume());
                    break;
                case 3:
                    System.out.print("\nMasukkan nilai jari-jari bola: ");
                    float jariJari = input.nextFloat();
                    Bola bola = new Bola(jariJari);
                    System.out.println("\nLuas permukaan bola adalah: " + bola.hitungLuasPermukaan());
                    System.out.println("Volume bola adalah: " + bola.hitungVolume());
                    break;
                case 4:
                    loop = true;
                default:
                    System.out.println("\n====== Pilihan tidak valid!! ========\n");
                    break;
            }
        }

        System.out.println("\n!! Terimakasih Telah menggunakan Program saya !!\n");
        input.close();
    }
}
