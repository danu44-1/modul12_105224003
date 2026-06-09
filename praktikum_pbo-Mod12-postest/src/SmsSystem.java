public class SmsSystem implements SmsNotifier {
    @Override
    public void sendSMS(String pesan) {
        System.out.println("Mengirim SMS: " + pesan);
    }
}
