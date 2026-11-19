package in.shital.Notification;

public class SmsService implements Notification {

    @Override
      public void SendNotification() {
         System.out.println(" pop-Up Order has been updated");
    }
}
