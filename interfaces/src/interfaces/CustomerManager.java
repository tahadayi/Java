package interfaces;

public class CustomerManager {
	
	private Logger [] loggers;
	
	public CustomerManager(Logger  [] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri Eklendi :" + customer.getFirsName());
		
		Utils.runLoggers(loggers, customer.getFirsName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi :" + customer.getFirsName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}

}
