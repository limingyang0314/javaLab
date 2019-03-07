package lab1.Memory;

public class Kingston extends Memory{
	//private final static String type = "Memory";
	private String name;
	private int price;
	private int volume;
	
	public Kingston(String name, int price, int volume){
		super(name, price, volume);
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

}
