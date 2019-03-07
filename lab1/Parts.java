package lab1;

public abstract class Parts {
	private String name;
	private int price;
	
	public Parts(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public abstract void work();
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	

}
