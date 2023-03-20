package QuestionInterviewProgram;

interface Main {
	public String name();
	public static void name3() {
		System.out.println("Kumar");
		
	} 
	default String name4() {
		return "arun";
	}

}
