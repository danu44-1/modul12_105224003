import java.util.ArrayList;

public class PusatKontrol extends PencarianK implements Validasi{
     private ArrayList<KeretaApi> daftarK = new ArrayList<>();

    PusatKontrol() {
        daftarK.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarK.add(new KeretaApi("K02","Parahyangan", "JKT - BDG", 15));
    }
    
    public ArrayList<KeretaApi> getDaftarK() {
        return daftarK;
    }

    public void pemesanan(String kodeKereta, String nik, String namaP, int jumlahTiket) throws DataPenumpangTidakValidException, RuteTidakDitemukanException, TiketHabisException{

        validasiNIK(nik);

        PusatKontrol pusat = new PusatKontrol();
        daftarK(pusat, kodeKereta);    
        
        sisaKursi(jumlahTiket);
        
        // if (jumlahTiket > valid.getSisaKursi()) {
        //     throw new TiketHabisException(valid.getNamaKereta(), valid.getSisaKursi());
        // }

        // valid.setSisaKursi(jumlahTiket);
        // System.out.println("\nRESERVASI BERHASIL DISIMPAN!");
        // System.out.println("Penumpang   : " + namaP);
        // System.out.println("NIK      : " + nik);
        // System.out.println("Kereta      : " + valid.getNamaKereta() + " (" + valid.getRutePerjalanan() + ")");
        // System.out.println("Jumlah Tiket: " + jumlahTiket + " kursi");
    }

    @Override
    public void validasiNIK(String nik) {
        
    }
}

