package lab1;
import lab1.CPU.*;
import lab1.Disk.*;
import lab1.Memory.*;
import lab1.MotherBoard.*;

public class Computer {
	private String name;
	private int price;
	private String describe;
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	private MotherBoard motherBoard;
	
	Computer(String name, CPU CPU, Disk Disk, Memory Memory, MotherBoard MotherBoard){
		this.name = name;
		this.describe = "\n CPU:" + CPU.getName() + "\n Disk:" + Disk.getName() + "\n Memory:" + Memory.getName() + "\n MotherBoard:" + MotherBoard.getName();
		this.cpu = CPU;
		this.disk = Disk;
		this.memory = Memory;
		this.motherBoard = MotherBoard;
		this.price = CPU.getPrice() + Disk.getPrice() + Memory.getPrice() + MotherBoard.getPrice();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescribe() {
		return this.describe;
	}
	
	public void work() {
		System.out.println(this.getName() +" work:");
		this.cpu.work();
		this.disk.work();
		this.memory.work();
		this.motherBoard.work();
	}
	
	public void describe() {
		System.out.println(this.getName() +" describe:"+ this.describe);
	}
	
	public void price() {
		System.out.println(this.getName() +" price:"+ this.price);
	}
	
	
	

}
