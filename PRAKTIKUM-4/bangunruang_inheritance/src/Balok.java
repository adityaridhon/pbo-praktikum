public class Balok extends BangunRuang {
    private float panjang;
    private float lebar;
    private float tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public float hitungLuasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
    }

    public float hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
