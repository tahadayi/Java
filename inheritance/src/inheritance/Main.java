package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer dayý = new IndividualCustomer();
		dayý.customerNumber="2345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";
		 
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {dayý,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);

	}

}
