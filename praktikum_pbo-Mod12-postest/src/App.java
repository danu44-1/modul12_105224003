public class App {
    public static void main(String[] args) throws Exception {
        EmailNotifier email = new EmailSystem();
        SmsNotifier sms = new SmsSystem();
        WhatsAppNotifier wa = new WASystem();

        OrderService orderS = new OrderService(email, sms, wa);

        Order order = new Order("105", 15000);
        PaymentMethod creditC = new CreditCard();

        orderS.processPayment(order, creditC);
    }
}
