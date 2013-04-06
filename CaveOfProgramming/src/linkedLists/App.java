package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> aList= new ArrayList<>();
		LinkedList<Integer> lList= new LinkedList<>();
		
		doTimings("ArrayList", aList);
		doTimings("LinedList", lList);
		
	}
	private static void doTimings(String type,List<Integer> list){
		for (int i=0; i<1E5;i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		for (int i = 0; i<1E5; i++){
			list.add(i);
		}
		long end= System.currentTimeMillis();
		
		System.out.println("Time taken: "+ (end-start)+" ms for "+type);
	}
}
