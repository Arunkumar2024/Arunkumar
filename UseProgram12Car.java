package QuestionInterviewProgram;

public class UseProgram12Car {

	public static void main(String[] args) {
		Program12Car a =(x)->{
			if(x.startsWith("B")) {
				return x;
			}
			else {
				return"OUT OF STOCK";
			}
		};
		System.out.println(a.FindBrand("BMW"));
		}
}

	
