
public class Student extends User {
	private int id;
	private String firstName;
	private String lastName;
	private String courseName;
	
	public Student() {
		
	}
	public Student(int id,String firstName,String lastName,String courseName) {
		this();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.courseName=courseName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
