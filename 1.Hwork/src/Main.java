
public class Main {

	public static void main(String[] args) {
		
		Lesson lesson1 = new Lesson(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Java");
		
		//Lesson lesson1 = new Lesson(); 
		//lesson1.id = 1;
		//lesson1.name = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		//lesson1.detail = "Java";
		
		Lesson lesson2 = new Lesson(); 
		lesson2.id = 2;
		lesson2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		lesson2.detail = "C#";
		
		Lesson[]  lessons = {lesson1,lesson2};
		
		for (Lesson lesson : lessons) {
			System.out.println(lesson.id);
			System.out.println(lesson.name);
			System.out.println(lesson.detail);
			
			LessonManager lessonManager = new LessonManager();
			
			lessonManager.addToCart(lesson1);
			
			lessonManager.addToCart(lesson2);
			
			Category category1 = new Category();
			category1.id = 1;
			category1.name = "Java";
			   
			Category category2 = new Category();
			category2.id = 2;
			category2.name = "C#";
			
		}
		
	}

}
