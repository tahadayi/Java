package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubeButonu = "�nternet �ubesi" ;
		
		System.out.println("Hello World");
		System.out.println(internetSubeButonu);
		double dolarDun = 8.19;
		double dolarBugun = 8.19;
		int vade = 35;
		
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar E�ittir");
		}
		
		String kredi1 = "h�zl� kredi";
		String kredi2 = "mutlu emekli kredi";
		String kredi3 = "konut kredi";
		String kredi4 = "�ift�i kredi";
		String kredi5 = "ms� kredi";
		String kredi6 = "meb kredi";
		String kredi7 = "K�lt�r bakanl��� kredi";

		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = {
				"h�zl� kredi",
				"mutlu emekli kredisi",
				"konut kredisi",
				"�ift�i kredisi",
				"ms� kredi",
				"meb kredi",
				"K�lt�r bakanl��� kredi"
				};
		for (String kredi : krediler) {
			System.out.println(kredi);
			
		}
		for (int i = 0; i<krediler.length; i++ ) {
			System.out.println(krediler[i]);
		}
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2 ;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int [] sayilar1= {1,2,3,4,5};
		int [] sayilar2= {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] =100;
		System.out.println(sayilar1[0]);		
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1 = sehir2;
		sehir2 ="izmir";
		System.out.println(sehir1);
		

		
	}
}
		
		

		

	
	
		
		

	


