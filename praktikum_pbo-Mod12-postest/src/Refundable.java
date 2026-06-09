public interface Refundable extends PaymentMethod{
    void refund(double amount);
}
