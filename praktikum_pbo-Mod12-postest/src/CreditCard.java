public class CreditCard implements Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("Mengeksekusi API Bank: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund Credit sebesar: " + amount);
    }
}
