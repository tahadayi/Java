
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
        instructor1.setFirstName("�brahim");
        instructor1.setLastName("UYLA�");
        instructor1.setTitle("Yaz�l�m M�hendisi");
        
        
		Student student1 =new Student();
		student1.setId(1);
		student1.setFirstName("Taha");
		student1.setLastName("DAYI");
        student1.setCourseName("Java & React");
        
        InstructorManager instructorManager =new InstructorManager();
        instructorManager.add(instructor1);
        
        StudentManager studentManager =new StudentManager();
        studentManager.add(student1);
	}
}

