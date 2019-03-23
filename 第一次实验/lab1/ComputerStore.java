package lab1;
import lab1.CPU.AMD;
import lab1.CPU.CPU;
import lab1.CPU.Intel;
import lab1.Disk.Disk;
import lab1.Disk.Seagate;
import lab1.Memory.Memory;
import lab1.Memory.Samsung;
import lab1.MotherBoard.Asus;
import lab1.MotherBoard.Gigabyte;
import lab1.MotherBoard.MotherBoard;

public class ComputerStore {
	public static void main(String[] args) {
		CPU CPU_1 = new AMD("Ryzen 2700x",2000,12);
		CPU CPU_2 = new Intel("Core I7 8700k",3000,12);
		Disk Disk_1 = new Seagate("CoolFish", 2048, 500);
		Memory Memory_1 = new Samsung("SM",1024,100);
		MotherBoard MB_1 = new Asus("ASUS_MB", 1000, 500);
		MotherBoard MB_2 = new Gigabyte("GB_MB", 800, 300);
		
		Computer computer1 = new Computer("computer1",CPU_1,Disk_1,Memory_1,MB_1);
		Computer computer2 = new Computer("computer2",CPU_2,Disk_1,Memory_1,MB_1);
		Computer computer3 = new Computer("computer3",CPU_2,Disk_1,Memory_1,MB_2);
		
		System.out.println("----------First----------");
		
		computer1.describe();
		computer1.work();
		computer1.price();
		
		System.out.println("----------Second---------");
		
		computer2.describe();
		computer2.work();
		computer2.price();
		
		System.out.println("----------Third----------");
		
		computer3.describe();
		computer3.work();
		computer3.price();

	}

}
