package QuestionInterviewProgram;

public class Program1Sleep {

	public static void main(String[] args) throws InterruptedException {
		String[] a = {"Arun","Kumar","varsha"};
		for(int i=0;i<a.length;i++) {
			Thread.sleep(2000);
			System.out.println(a[i]);
			Thread.sleep(3000);
			System.out.println("Welcome");
			
		}

	}

}
