public class ValidasiPanjangNIK implements Validasi {
    @Override
    public void validasiNIK(String nik) throws DataPenumpangTidakValidException {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("Data penumpang " + nik + " Tidak Valid!" );
        }
    }
}
