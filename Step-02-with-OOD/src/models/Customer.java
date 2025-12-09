/*package models;

public class Customer {
    public String name;
    public String email;
    public String city;
    public String mobile;
    public Customer(String name, String email, String mobile, String city){
        this.name = name; this.email = email; this.city = city;this.mobile=mobile;
    }
}*/
package models;

public class Customer {
private final String name;
private final String email;
private final String phone;
private final String address;


public Customer(String name, String email, String phone, String address) {
this.name = name;
this.email = email;
this.phone = phone;
this.address = address;
}


public String getName() { return name; }
public String getEmail() { return email; }
public String getPhone() { return phone; }
public String getAddress() { return address; }
}