public class OrderService {
    private EmailNotifier email;
    private SmsNotifier sms;
    private WhatsAppNotifier wa;

    OrderService(EmailNotifier email, SmsNotifier sms, WhatsAppNotifier wa) {
        this.email = email;
        this.sms = sms;
        this.wa = wa;
    }

    public void processPayment(Order order, PaymentMethod payment) {
        System.out.println("Data Pesanan disimpan dengan ID, " + order.getOrderId());
        payment.pay(order.getTotalAmount());

        email.sendEmail("Resi untuk pesanan " + order.getOrderId() + " telah diterbitkan.");
        sms.sendSMS("Resi untuk pesanan " + order.getOrderId() + " telah diterbitkan.");
        wa.sendWhatsapp("Resi untuk pesanan " + order.getOrderId() + " telah diterbitkan.");
    }
}
