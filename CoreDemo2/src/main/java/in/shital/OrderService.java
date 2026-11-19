package in.shital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class OrderService {
   PaymentService p;

   @Autowired
   public OrderService(@Qualifier("UP")PaymentService p){
       this.p=p;
   }
   public void order(){
       System.out.println("Order has been placed");
       p.pay();
   }

}
