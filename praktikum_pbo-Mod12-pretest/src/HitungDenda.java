public class HitungDenda implements PeminjamanBuku {
    @Override
    public double peminjaman(double waktu) {
        return waktu * 60;
    }
}
