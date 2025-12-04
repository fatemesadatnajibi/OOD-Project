
package services;

class SmsSender { 
    public void sendSmsMessage(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}