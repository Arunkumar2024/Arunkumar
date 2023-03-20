package QuestionInterviewProgram;

public class Human {
	public Human(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String nationality() {
		return "INDIAN";
	}
	@Override
	public String toString() {
		return (name+age);
	}

}
