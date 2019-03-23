package lab1.MotherBoard;
import lab1.Parts;

public abstract class MotherBoard implements Parts{
	private final static String type = "MotherBoard";
	private String name;
	private int price;
	private int speed;
	
	public MotherBoard(String name, int price ,int speed){
		this.name = name;
		this.price = price;
		this.speed = speed;
	}
	
	public void work() {
		System.out.println(" " + MotherBoard.type + "Work");
	}
	
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public int getSpeed(){
		return this.speed;
	}

}
