/*package models;

public class Room {
    public String number;
    public String type; // "standard" or "luxury"
    public double price;

    public Room(String number, String type, double price){
        this.number = number;
        this.type = type;
        this.price = price;
    }
}*/
package models;


public class Room {
protected final String roomNumber;
protected final double pricePerNight;


public Room(String roomNumber, double pricePerNight) {
this.roomNumber = roomNumber;
this.pricePerNight = pricePerNight;
}


public String getRoomNumber() { return roomNumber; }
public double getPricePerNight() { return pricePerNight; }
}
