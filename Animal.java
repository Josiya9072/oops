class Animal
{
String name;
String species;
void display()
{
System.out.println(name);
System.out.println(species);
}
public static void main(String[]args)
{
Animal obj=new Animal();
obj.name="tiger";
obj.species="p.tigris";
obj.display();
}
}
