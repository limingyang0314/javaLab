package lab1.Disk;
import lab1.Parts;

public abstract class Disk implements Parts{
	private final static String type = "Disk";
	private String name;
	private int price;
	private int volume;
	
	public Disk(String name, int price, int volume){
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	public void work() {
		System.out.println(" " + Disk.type + "Work");
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
}
