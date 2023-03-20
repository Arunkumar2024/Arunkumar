package QuestionInterviewProgram;

public class Program11SingleTon {
	public static Program11SingleTon a = null;
	public String b;
	public String c;
   Program11SingleTon() {
		b="hi";
		c ="OH";
	}
   public static Program11SingleTon program11SingleTo() {
	   if(a==null) {
		   a=new Program11SingleTon();
	   }
	   return a;
   }
	

}
