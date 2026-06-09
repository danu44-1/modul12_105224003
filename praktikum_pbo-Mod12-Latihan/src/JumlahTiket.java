public class JumlahTiket implements Kursi{
    // public void tiketDipesan(PencarianK kereta, int jumlahTiket) {
    //     if (jumlahTiket > kereta.getSisaKursi()) {
    //         throw new TiketHabisException(kereta.getNamaKereta(), kereta.getSisaKursi());
    //     }
    // }

    @Override
    public int sisaKursi(int sisaKursi) {
        PencarianK k = new PencarianK();
        if (sisaKursi > k.sisaKursi(sisaKursi)) {
             throw new TiketHabisException(k.getNamaKereta(), k.getSisaKursi());
        }
        return sisaKursi;
    }
}
