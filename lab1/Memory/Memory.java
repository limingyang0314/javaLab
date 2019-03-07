package lab1.Memory;
import lab1.Parts;

public abstract class Memory extends Parts{
	private final static String type = "Memory";
	private String name;
	private int price;
	private int volume;
	
	public Memory(String name, int price, int volume){
		super(name,price);
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	public void work() {
		System.out.println(" " + Memory.type + "Work");
	}

//	public String getName() {
//		return this.name;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}
}
