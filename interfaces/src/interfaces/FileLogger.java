package interfaces;

public class FileLogger implements Logger {
	
	public void log(String message) {
		
		System.out.println("Dosyaya loglandý : " + message);
	}

}
