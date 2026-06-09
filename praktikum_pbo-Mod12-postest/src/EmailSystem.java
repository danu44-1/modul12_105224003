public class EmailSystem implements EmailNotifier{
    @Override
    public void sendEmail(String pesan) {
        System.out.println("Mengirim Email: " + pesan);
    }
}
