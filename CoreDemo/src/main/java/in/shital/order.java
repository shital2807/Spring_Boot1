package in.shital;

import in.shital.Notification.EmailService;
import in.shital.Notification.Notification;
import in.shital.Notification.SmsService;

public class order {

    Notification n =new SmsService();
      void Order(){
        System.out.println("Order");
        n.SendNotification();
    }
}
