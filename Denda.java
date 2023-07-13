public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private static final int TARIF_DENDA = 10000 ;

    public Denda(Peminjaman peminjaman, int hariTerlambat) {
        this.peminjaman = peminjaman;
        this.hariTerlambat = hariTerlambat;
    }

    public Peminjaman getpeminjaman() {
        return peminjaman;
    }

    public int getTagihan() {
        return hariTerlambat * TARIF_DENDA;
    }
}
