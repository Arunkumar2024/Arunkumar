package QuestionInterviewProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program4Decending {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,4,2,6,5,8);
		list.sort(Comparator.naturalOrder());//Assending order
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);//Decending order

	}

}
