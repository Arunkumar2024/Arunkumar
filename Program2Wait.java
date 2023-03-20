package QuestionInterviewProgram;

public class Program2Wait  {
	public static void main(String[] args) throws InterruptedException{
	
	synchronized (args) {
		args.wait(2000);
		int a=10+5;
		System.out.println(a);
		args.wait(3000);
		System.out.println("Object is in waiting state ");
	}
	

}
	   
}
	