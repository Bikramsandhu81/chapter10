
public class TestingGivenExample {
	public static void main(String [] args){
		String s = "Java";
		StringBuilder string = new StringBuilder(s);
		change(s, string);
	    System.out.println(s);
	    System.out.println(string);
			
		}
	public static void change(String s, StringBuilder string){
		s = s + " and HTML";
		string.append(" and HTML");
		 
	}

}
