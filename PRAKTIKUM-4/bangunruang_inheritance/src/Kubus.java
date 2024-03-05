public class Kubus extends BangunRuang {
    private float sisi;

    public Kubus(float sisi) {
        this.sisi = sisi;
    }

    public float hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public float hitungVolume() {
        return sisi * sisi * sisi;
    }
}
