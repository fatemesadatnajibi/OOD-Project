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



import models.Customer;
import models.Room;
import models.LuxuryRoom;
import reservation.Reservation;
import reservation.ReservationService;
import payment.CashPayment;
import payment.PaypalPayment;
import payment.PaymentMethod;
import notification.EmailNotifier;
import notification.Notifier;


public class Main {
public static void main(String[] args) {
Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
Room room = new LuxuryRoom("203", 150);
Reservation res = new Reservation(room, customer, 2);


PaymentMethod pm1 = new PaypalPayment();
Notifier notifier1 = new EmailNotifier();
ReservationService service1 = new ReservationService(pm1, notifier1);
service1.makeReservation(res);


System.out.println();
ReservationService service3 = new ReservationService(
        new CashPayment(),
        new EmailNotifier()
);

service3.makeReservation(res);


}
}