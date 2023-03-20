package QuestionInterviewProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program9FlatMap {

	public static void main(String[] args) {
		
		        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
		          
		       
		        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
		          
		        
		        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
		  
		        List<List<Integer>> listOfAll =
		                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		  
		        System.out.println("The Structure before flattening is : " +
		                                                  listOfAll);
		          
		        
		        List<Integer> listofConcat  = listOfAll.stream()
		                                    .flatMap(x -> x.stream())
		                                    .collect(Collectors.toList());
		  
		        System.out.println("The Structure after flattening is : " +
		                                                         listofConcat);
		    }
		}

	


