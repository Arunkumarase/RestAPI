package restuarant.libraries.paytm;

import restuarant.adapters.PaymentGatewayAdapter;
import restuarant.models.Payment;
import restuarant.models.PaymentStatus;

public class PaytmApiAdapter implements PaymentGatewayAdapter {
    private PaytmApi paytmApi = new PaytmApi();
    @Override
    public Payment makePayment(long billId, double amount) {
        PaytmPaymentResponse paytmPaymentResponse = paytmApi.makePayment(billId, amount);
        Payment payment = new Payment();
        if (paytmPaymentResponse.getPaymentStatus().equals("SUCCESS")) {
            payment.setPaymentStatus(PaymentStatus.SUCCESS);
        } else {
            payment.setPaymentStatus(PaymentStatus.FAILURE);
        }
        payment.setBillId(billId);
        payment.setTxnId(paytmPaymentResponse.getTxnId());
        return payment;
    }
}
