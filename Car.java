class Car 
{
String brand;
int year;
void display()
{
System.out.println(brand);
System.out.println(year);
}
public static void main(String args[])
{
Car details=new Car();
details.brand="mini cooper";
details.year=2024;
details.display();
}
}
