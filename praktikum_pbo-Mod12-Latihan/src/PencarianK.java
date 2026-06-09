public class PencarianK implements Kursi{
    KeretaApi valid = null;

    PencarianK() {
        valid = null;
    }

    public KeretaApi daftarK(PusatKontrol kereta, String kode) throws RuteTidakDitemukanException{
        for (KeretaApi k : kereta.getDaftarK()) {
            if (k.getKodeKereta().contentEquals(kode)) {
                valid = k;
                break;
            }
        }

        if (valid == null) {
            throw new RuteTidakDitemukanException("Kode kereta '" + valid.getKodeKereta() + "' tidak ditemukan dalam sistem.");
        }

        return valid;
    }

    @Override
    public int sisaKursi(int sisaKursi) {
        return sisaKursi = valid.getSisaKursi();
    }
}
