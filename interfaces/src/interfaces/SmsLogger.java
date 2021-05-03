package interfaces;

public class SmsLogger implements Logger {
	
	public void log(String message) {
		System.out.println("SMS loglandý : " + message);
	}
	
}