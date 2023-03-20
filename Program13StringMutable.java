package QuestionInterviewProgram;

public class Program13StringMutable {

	public static void main(String[] args) {
		String a = "Arun";
		System.out.println(a.hashCode());
		a=a.concat("kumar");
		System.out.println(a);
		System.out.println(a.hashCode());
		StringBuffer c = new StringBuffer("Arun");
		System.out.println(c.hashCode());
		c.append("Kumar");
		System.out.println(c);
		System.out.println(c.hashCode());
		


	}

}
