/*package models;
public class LuxuryRoom extends Room {
    public LuxuryRoom(String number, double price){
        super(number, "luxury", price);
    }
    public void addFreeDinner(){
        System.out.println("Free dinner added for luxury room " + number);
    }
}*/
package models;


public class LuxuryRoom extends Room {
public LuxuryRoom(String roomNumber, double pricePerNight) {
super(roomNumber, pricePerNight);
}


// یک متد نمونه برای گسترش ویژگی
public double getServiceCharge() {
return 20.0; // مقدار ثابت نمونه
}
}