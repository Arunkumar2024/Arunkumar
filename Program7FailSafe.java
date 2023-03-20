package QuestionInterviewProgram;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class Program7FailSafe {

	public static void main(String[] args) {
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<String,Integer>();
		map.put("one", 1);
		map.put("two",2);
		map.put("three", 3);
		map.put("four",4);
		Iterator<Map.Entry<String,Integer>> iterato= map.entrySet().iterator();
		while(iterato.hasNext()) {
			Map.Entry<String,Integer> entr = iterato.next();
			System.out.println(entr.getKey()+": "+entr.getValue());
			map.put("five", 5);
		}

	}

}
