package pl.training.payments.domain;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pl.training.payments.ports.input.GetPaymentUseCase;
import pl.training.payments.ports.model.*;
import pl.training.payments.ports.output.PaymentReader;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class GetPaymentService implements GetPaymentUseCase {

    private final PaymentReader paymentReader;

    @Override
    public Payment getById(String id) {
        return paymentReader.getById(id)
                .orElseThrow(PaymentNotFoundException::new);
    }

    @Override
    public ResultPage<Payment> getByStatus(PaymentStatus status, PageRequest pageRequest) {
        return paymentReader.getByStatus(status, pageRequest);
    }

}
