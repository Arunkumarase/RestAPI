package restuarant.controllers;

import restuarant.Dtos.MakePaymentRequestDto;
import restuarant.Dtos.MakePaymentResponseDto;
import restuarant.exceptions.InvalidBillException;
import restuarant.models.Bill;
import restuarant.repositories.BillRepository;
import restuarant.services.PaymentService;

import java.util.Optional;

public class PaymentController {

    private PaymentService paymentService;
    private BillRepository billRepository;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public MakePaymentResponseDto makePayment(MakePaymentRequestDto makePaymentRequestDto) throws InvalidBillException {

        Optional<Bill> bill = billRepository.findById(makePaymentRequestDto.getBillId());

        if (bill.isEmpty()) {
            throw new InvalidBillException("Invalid bill id");
        }
        double amount = bill.get().getTotalAmount();

        return null;
    }
}
