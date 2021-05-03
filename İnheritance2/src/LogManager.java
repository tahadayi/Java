
public class LogManager {
	
	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritabanýna loglandý");
		}
		
		if(logType==2) {
			System.out.println("dosyaya loglandý");
		}
		
		if(logType==3) {
			System.out.println("e-mail loglandý");
		}
	}

}
