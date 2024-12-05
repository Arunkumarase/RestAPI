package restuarant.libraries.razorpay;

import restuarant.adapters.PaymentGatewayAdapter;
import restuarant.models.Payment;
import restuarant.models.PaymentStatus;

public class RazorpayAdapter implements PaymentGatewayAdapter {
    private RazorpayApi razorpayApi = new RazorpayApi();
    @Override
    public Payment makePayment(long billId, double amount) {
        RazorpayPaymentResponse razorpaypaymentResponse = razorpayApi.processPayment(billId, amount);
        Payment payment = new Payment();
        if (razorpaypaymentResponse.getPaymentStatus().equals("SUCCESS")) {
            payment.setPaymentStatus(PaymentStatus.SUCCESS);
        } else {
            payment.setPaymentStatus(PaymentStatus.FAILURE);
        }
        payment.setBillId(billId);
        payment.setTxnId(razorpaypaymentResponse.getTransactionId());
        return payment;
    }
}
