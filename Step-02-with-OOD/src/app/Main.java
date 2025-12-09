/*import constants.PaymentMethods;
import models.Customer;
import models.LuxuryRoom;
import constants.Notifier;
import models.Room;
import reservation.Reservation;
import reservation.ReservationService;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        ReservationService service = new ReservationService();
        service.makeReservation(res, PaymentMethods.PAYPAL, Notifier.EMAIL);
    }
}*/
package app;


import models.Customer;
import models.Room;
import models.LuxuryRoom;
import reservation.Reservation;
import reservation.ReservationService;
import payment.OnSitePayment;
import payment.PaypalPayment;
import payment.PaymentMethod;
import notification.EmailNotifier;
import notification.SmsNotifier;
import notification.Notifier;


public class Main {
public static void main(String[] args) {
Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
Room room = new LuxuryRoom("203", 150);
Reservation res = new Reservation(room, customer, 2);


// مثال 1: پرداخت با PayPal و اطلاع‌رسانی ایمیل
PaymentMethod pm1 = new PaypalPayment();
Notifier notifier1 = new EmailNotifier();
ReservationService service1 = new ReservationService(pm1, notifier1);
service1.makeReservation(res);


System.out.println();


// مثال 2: پرداخت حضوری و ارسال SMS
PaymentMethod pm2 = new OnSitePayment();
Notifier notifier2 = new SmsNotifier();
ReservationService service2 = new ReservationService(pm2, notifier2);
service2.makeReservation(res);
}
}