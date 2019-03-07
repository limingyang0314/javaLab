package lab1.CPU;
import lab1.Parts;

public abstract class CPU extends Parts{
	private final static String type = "CPU";
	private String name;
	private int price;
	private int coreNum;
	
	public CPU(String name, int price, int coreNum){
		super(name,price);
		this.name = name;
		this.price = price;
		this.coreNum = coreNum;
		//System.out.println(this.name);
	}
	
	public void work() {
		System.out.println(" " + CPU.type + "Work");
	}
	
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getPrice() {
//		return this.price;
//	}

}
