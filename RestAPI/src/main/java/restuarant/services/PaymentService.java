package restuarant.services;

import restuarant.exceptions.InvalidBillException;
import restuarant.models.Payment;

public interface PaymentService {
    Payment makePayment(long billId) throws InvalidBillException;
}
