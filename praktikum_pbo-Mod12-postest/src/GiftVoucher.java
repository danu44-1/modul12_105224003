public class GiftVoucher implements Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("Membayar menggunakan Gift Voucher sebesar: " + amount);
    }

    @Override
    public void refund(double amount) {
        throw new UnsupportedOperationException("Voucher Tidak dapat di-refund!");
    }
}
