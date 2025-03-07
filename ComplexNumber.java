import java.util.Scanner;
class ComplexNumber 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter real part of first complex number: ");
double real1 = sc.nextDouble();
System.out.print("Enter imaginary part of first complex number: ");
double imaginary1 = sc.nextDouble();
System.out.print("Enter real part of second complex number: ");
double real2 = sc.nextDouble();
System.out.print("Enter imaginary part of second complex number: ");
double imaginary2 = sc.nextDouble();
double resultReal = real1 + real2;
double resultImaginary = imaginary1 + imaginary2;
System.out.println("Sum of the two complex numbers: " + resultReal + " + " + resultImaginary + "i");
sc.close();
}
}

