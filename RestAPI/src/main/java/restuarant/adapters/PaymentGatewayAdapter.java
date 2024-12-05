package restuarant.adapters;

import restuarant.models.Payment;

public interface PaymentGatewayAdapter {

    Payment makePayment(long billId, double amount);
}
