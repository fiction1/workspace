package cave;

public class Car {
	private String name;
	
	public Car(){
		
	}
	
	
	public Car(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void start(){
		System.out.println("Car started!");
	}

}
