
public class Instructor extends User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String title;
	
	public Instructor() {
		
	}
	public Instructor(int id,String firstName,String lastName,String title) {
		
		this();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.title=title;
		
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
