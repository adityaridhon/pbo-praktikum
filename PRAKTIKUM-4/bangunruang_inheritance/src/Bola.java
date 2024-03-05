public class Bola extends BangunRuang {
    private float jariJari;

    public Bola(float jariJari) {
        this.jariJari = jariJari;
    }

    public float hitungLuasPermukaan() {
        return 4 * (float) Math.PI * jariJari * jariJari;
    }

    public float hitungVolume() {
        return (float) (4.0 / 3.0 * Math.PI * jariJari * jariJari * jariJari);
    }
}
