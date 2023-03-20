package QuestionInterviewProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program6Failfast {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,1,4,2);
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			numbers.add(5);
		}

	}

}
