package QuestionInterviewProgram;

public class Teacher extends Human {
	public Teacher(String name, int age, String disinganation, int salary) {
		super(name, age);
		this.disinganation = disinganation;
		this.salary = salary;
	}
	String disinganation;
	int salary;
	public String getDisinganation() {
		return disinganation;
	}
	public void setDisinganation(String disinganation) {
		this.disinganation = disinganation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		
		return (super.toString()+disinganation+salary);
	}
	

}
