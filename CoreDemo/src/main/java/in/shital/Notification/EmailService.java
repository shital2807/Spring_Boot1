package in.shital.Notification;

public class EmailService  implements Notification{

         @Override
          public void SendNotification(){
         System.out.println("order has been placed");
    }
}
