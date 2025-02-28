class Rectangle
{
double length;
double breadth;
double area()
{
return length*breadth;
}
public static void main(String[] args)
{
Rectangle rec1=new Rectangle();
Rectangle rec2=new Rectangle();
rec1.length=10;
rec1.breadth=20;
rec2.length=30;
rec2.breadth=40;
System.out.println("Area of rec1:"+rec1.area());
System.out.println("Area of rec2:"+rec2.area());
}
}
