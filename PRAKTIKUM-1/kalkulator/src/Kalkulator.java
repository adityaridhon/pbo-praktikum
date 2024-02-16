import java.util.Scanner;

public class Kalkulator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("\n.:: KALKULATOR JAVA ::.\n");

    System.out.println(".:::: MASUKKAN ANGKA ::::.\n");
    System.out.print("Angka Pertama: ");
    float angkaPertama = input.nextFloat();

    System.out.print("Angka Kedua: ");
    float angkaKedua = input.nextFloat();

    System.out.println("\nPilih Operasi:");
    System.out.println("1. +");
    System.out.println("2. -");
    System.out.println("3. x");
    System.out.println("4. /");
    System.out.println("5. %");
    System.out.print("\nMasukkan Operasi: ");
    int operation = input.nextInt();
    input.close();

    switch (operation) {
      case 1:
        System.out.println(
            "Hasil dari " + angkaPertama + " + " + angkaKedua + " adalah "
                + (angkaPertama + angkaKedua));
        System.out.println("\n!! Terimakasih Telah menggunakan Kalkulator saya !!\n");
        break;
      case 2:
        System.out.println(
            "Hasil dari " + angkaPertama + " - " + angkaKedua + " adalah "
                + (angkaPertama - angkaKedua));
        System.out.println("\n!! Terimakasih Telah menggunakan Kalkulator saya !!\n");
        break;
      case 3:
        System.out.println("Hasil dari " + angkaPertama + " x " + angkaKedua + " adalah "
            + (angkaPertama * angkaKedua));
        System.out.println("\n!! Terimakasih Telah menggunakan Kalkulator saya !!\n");
        break;
      case 4:
        System.out.println("Hasil  dari " + angkaPertama + " / " + angkaKedua + " adalah "
            + ((float) angkaPertama / angkaKedua));
        System.out.println("\n!! Terimakasih Telah menggunakan Kalkulator saya !!\n");
        break;
      case 5:
        System.out.println("Hasil dari " + angkaPertama + " % " + angkaKedua + " adalah "
            + ((float) angkaPertama
                % angkaKedua));
        System.out.println("\n!! Terimakasih Telah menggunakan Kalkulator saya !!\n");
        break;
      default:
        System.out.println("Masukkan angka tidak valid!");
        break;
    }

  }
}
