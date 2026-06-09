public class OvoMethod implements Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("Mengeksekusi API OVO: " + amount); 
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund OVO sebesar: " + amount);
    }
}
