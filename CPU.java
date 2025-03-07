class CPU 
{
double price;
public CPU(double price) 
{
this.price = price;
}
public class Processor
{
int cores;
String manufacturer;
public Processor(int cores, String manufacturer) 
{
this.cores = cores;
this.manufacturer = manufacturer;
}
public void displayProcessorInfo() 
{
System.out.println("Processor Information:");
System.out.println("Cores: " + cores);
System.out.println("Manufacturer: " + manufacturer);
}
}
public static class RAM 
{
int memory;
String manufacturer;
public RAM(int memory, String manufacturer) 
{
this.memory = memory;
this.manufacturer = manufacturer;
}
void displayRAMInfo() 
{
System.out.println("RAM Information:");
System.out.println("Memory: " + memory + " GB");
System.out.println("Manufacturer: " + manufacturer);
}
}
void displayCPUInfo() 
{
System.out.println("CPU Information:");
System.out.println("Price: $" + price);
}
public static void main(String[] args) 
{
CPU cpu = new CPU(300.50);
CPU.Processor processor = cpu.new Processor(8, "Intel");
CPU.RAM ram = new CPU.RAM(16, "Corsair");
cpu.displayCPUInfo();
processor.displayProcessorInfo();
ram.displayRAMInfo();
}
}

