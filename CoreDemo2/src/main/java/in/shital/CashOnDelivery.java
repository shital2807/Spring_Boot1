package in.shital;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CashOnDelivery implements PaymentService{
    @Override
    public void pay() {

        System.out.println("pay through COD");
    }
}
