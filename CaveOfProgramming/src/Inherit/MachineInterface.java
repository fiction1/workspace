package Inherit;

public class MachineInterface implements Info {
	private int id=7;
	
	public void start(){
		System.out.println("Machine started!");
		}
	
	@Override
	public void showInfo() {
		System.out.println("Machine id is: "+id);
	}
	
	
}
