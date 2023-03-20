package QuestionInterviewProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program15SecoundMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,33,44,55,66,77);
		int secondmax = list.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().get();
		System.out.println(secondmax);
		
//		int max=0;
//		
//		for(Integer i : list) {
//			if(max<i) {
//				max=i;
//				//System.out.println(i);
//				
//				
//			}
//			int secmax=max;
//			if(max>i) {
//				secmax=i;
//				System.out.println(secmax);
//			}
//			
//		}
//		
//		System.out.println(max);
		

	}

}
