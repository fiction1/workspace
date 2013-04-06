package poly;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		Plant plant2 = tree1;

		plant1.grow();
		plant2.grow();
		
		tree1.shedLeaves();
	//	doGrow(tree1);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}

}
