package lab1.CPU;

public class Intel extends CPU{
	//private final static String type = "CPU";
	private String name;
	private int price;
	private int coreNum;
	public Intel(String name, int price, int coreNum){
		super(name,price,coreNum);
		this.name = name;
		this.price = price;
		this.coreNum = coreNum;
	}

}
