package in.shital;

import in.shital.Notification.EmailService;
import in.shital.Notification.Notification;
import in.shital.Notification.SmsService;

public class order {
    Notification n;
      public order(Notification n){
          this.n=n;
      }
        void OrderPlace(){
          n.SendNotification();
          System.out.println("Order is been placed");

        }
    }

