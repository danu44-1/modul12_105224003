public class ValidasiKarakterNIK implements Validasi {
    @Override
    public void validasiNIK(String nik) throws DataPenumpangTidakValidException {
        for (char c : nik.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new DataPenumpangTidakValidException("Data penumpang " + nik + " Tidak Valid!");
            }
        }
    }
}
