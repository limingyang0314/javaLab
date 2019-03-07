package lab1.Disk;

public class WestDigitals extends Disk{
	//private final static String type = "Disk";
	private String name;
	private int price;
	private int volume;
	
	public WestDigitals(String name, int price, int volume){
		super(name,price,volume);
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
}
