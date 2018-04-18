
public class TestCourse {
	public static void main(String[] args){
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		
		course1.addStudent("Bikram");
		course1.addStudent("jay");
		course1.addStudent("Liza");
		
		course2.addStudent("kiran");
		course2.addStudent("stacy");
		
		System.out.println("Number of students in course1: " 
				+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++){
			System.out.println(students[i] + ", " );
			
			System.out.println();
			System.out.println("Number of studetns in course2: " +
			course2.getNumberOfStudents());
		}
	}

}
