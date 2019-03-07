package lab1.CPU;

public class AMD extends CPU{
	//private final static String type = "CPU";
	private String name;
	private int price;
	private int coreNum;
	public AMD(String name, int price, int coreNum){
		super(name,price,coreNum);
		this.name = name;
		this.price = price;
		this.coreNum = coreNum;
		//System.out.println(this.name);
	}

}
