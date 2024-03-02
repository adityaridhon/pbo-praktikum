import java.util.Scanner;
import java.lang.Math;

class Kubus {
    private float sisi;

    public Kubus(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public float hitungVolume() {
        return sisi * sisi * sisi;
    }
}

class Balok {
    private float panjang;
    private float lebar;
    private float tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
    }

    public float hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola {
    private float jariJari;

    public Bola(float jariJari) {
        this.jariJari = jariJari;
    }

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public float hitungLuasPermukaan() {
        return 4 * (float) Math.PI * jariJari * jariJari;
    }

    public float hitungVolume() {
        return (4 / 3) * (float) Math.PI * jariJari * jariJari * jariJari;
    }
}

public class BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
            default:
                System.out.println("\n====== Pilihan tidak valid!! ========\n");
                break;
        }
        System.out.println("\n!! Terimakasih Telah menggunakan Program saya !!\n");
        input.close();

    }
}
