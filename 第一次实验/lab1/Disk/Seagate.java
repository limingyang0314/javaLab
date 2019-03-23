package lab1.Disk;

public class Seagate extends Disk{
	//private final static String type = "Disk";
	private String name;
	private int price;
	private int volume;
	
	public Seagate(String name, int price, int volume){
		super(name,price,volume);
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

}
