package QuestionInterviewProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program5Duplicate {



	public static void main(String[] args) {

		List<String> name=Arrays.asList("ram","kumar","vinoth","ram");
		System.out.println(name);
		List<String> names=name.stream().distinct().collect(Collectors.toList());
		System.out.println(names);
		
	}

}
