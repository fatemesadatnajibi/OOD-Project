/*package services;

import models.Customer;
import models.Room;

public class Reservation {
    public Room room;
    public Customer customer;
    public int nights;

    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }
    public double totalPrice(){
        return room.price * nights;
    }
}*/
package reservation;


import models.Room;
import models.Customer;


public class Reservation {
private final Room room;
private final Customer customer;
private final int nights;


public Reservation(Room room, Customer customer, int nights) {
this.room = room;
this.customer = customer;
this.nights = nights;
}


public Room getRoom() { return room; }
public Customer getCustomer() { return customer; }
public int getNights() { return nights; }


// برای رعایت قانون دمیتر (PLK) و جلوگیری از زنجیره تماس‌ها
public double calculateTotal() {
double base = room.getPricePerNight() * nights;
// اگر room از نوع LuxuryRoom و متد سرویس دارد، می‌توان اینجا افزود
return base;
}


public String summary() {
return String.format("Reservation for %s in room %s for %d nights. Total: %.2f",
customer.getName(), room.getRoomNumber(), nights, calculateTotal());
}
}