package in.shital;

import org.springframework.stereotype.Component;

@Component
public class UpiPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}
