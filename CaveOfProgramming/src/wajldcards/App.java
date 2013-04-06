package wajldcards;

import java.util.ArrayList;

class Machine {
	public void start(){
		System.out.println("Machine starting.");
	}

	@Override
	public String toString() {
		return "I am a machine";
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap(){
		System.out.println("Camera snapped");
	}
}

// ///////////
public class App {
	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		showList(list1);
		showList(list2);
		showList2(list2);
		
		
	}
	
	
	public static void showList(ArrayList<? extends Machine> list){
		for (Machine string : list) {
			System.out.println(string);
			string.start();
			
		}
		
	}
	public static void showList2(ArrayList<? super Camera> list){
		for (Object string : list) {
			System.out.println(string);
		}
		
	}
	public static void showList3(ArrayList<?> list){
		for (Object string : list) {
			System.out.println(string);
		}
		
	}
}
