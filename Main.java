public class Main {
    
    public static void main(String[] args) {
       
        new Buku("B001", "Pemrograman Java");
        Buku buku2 = new Buku("B002", "Pemrograman C++");
        new BukuLuar("B003", "Harry Potter");

        Petugas petugas1 = new Petugas("Alex", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Budi");
        peminjam1.setKodePeminjam("M001");

        peminjam1.doLogin();

    try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku2);
        Denda denda1 = new Denda(peminjaman1, 7);

        System.out.println("Nama Peminjam: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Kode Peminjam " + peminjaman1.getPeminjam().getKodePeminjam());
        System.out.println("Nama Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Nama Buku: " + peminjaman1.getBuku().getNamaBuku());

        System.out.println("Tagihan denda: " + denda1.getTagihan());

        System.out.println("=== Denda dihapuskan ! ===");
        peminjam1.addAntiDenda();
        System.out.println("Tagihan denda: " + denda1.getTagihan());

        System.out.println("=== Denda ditambahkan ! ===");
        peminjam1.removeAntiDenda();
        System.out.println("Tagihan denda: " + denda1.getTagihan());

    } catch (Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    } finally {
        System.out.println("Program selesai");
    }
    peminjam1.doLogout();
    }
}
