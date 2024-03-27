package NotificationFactory;

import java.util.Scanner;
public class NotificationFactory {

    public Notification createNotification()
    {
    	String channel = "";
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please choose channel : SMS / EMAIL / PUSH");
    	channel = input.nextLine();
    	
        if (channel == null || channel.isEmpty())
            return null;
        
        switch (channel) {
        
	        case "SMS":
	            return new SMSNotification();
	        case "EMAIL":
	            return new EmailNotification();
	        case "PUSH":
	            return new PushNotification();
	        default:
	            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }

}
