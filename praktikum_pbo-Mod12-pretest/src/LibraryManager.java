public class LibraryManager  implements PeminjamanBuku{
    String judul;
    double waktuMulai;

    public LibraryManager(String judul, double waktuMulai) {
        this.judul = judul;
        this.waktuMulai = waktuMulai;
    }

    @Override
    public double peminjaman(double waktu) {
        return waktu += waktuMulai;
    }
}
