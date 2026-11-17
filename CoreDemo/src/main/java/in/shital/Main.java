package in.shital;

import in.shital.Notification.EmailService;
import in.shital.Notification.Notification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        //shitttttallll
        Notification nk= new EmailService();
        order or =new order(nk);
        or.OrderPlace();
        }
    }

