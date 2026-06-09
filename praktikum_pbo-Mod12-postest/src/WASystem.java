public class WASystem implements WhatsAppNotifier {
    @Override
    public void sendWhatsapp(String pesan) {
        System.out.println("Mengirim WA: " + pesan);
    }
}
