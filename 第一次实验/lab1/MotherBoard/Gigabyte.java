package lab1.MotherBoard;

public class Gigabyte extends MotherBoard{
	//private final static String type = "MotherBoard";
	private String name;
	private int price;
	private int speed;
	
	public Gigabyte(String name, int price ,int speed){
		super(name,price,speed);
		this.name = name;
		this.price = price;
		this.speed = speed;
	}
}
