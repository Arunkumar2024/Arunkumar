package QuestionInterviewProgram;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program8Consumer {

	public static void main(String[] args) {
		Consumer<Integer> b = (x)-> System.out.println(x);
		b.accept(5);

	
	
	// Predicate
	Predicate<Integer> d = (y)-> y > 100;
	System.out.println(d.test(200));
	
	//Function
	Function<Integer, Integer> a = (x)->x+2000;
	System.out.println(a.apply(1000));
	
	//Supplier
	Supplier<String> c = ()->"HELLO ONESOFT";
	System.out.println(c.get());

}
}
