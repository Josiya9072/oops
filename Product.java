class Product {
int pcode;
String pname;
double price;
public Product(int pcode, String pname, double price) 
{
this.pcode = pcode;
this.pname = pname;
this.price = price;
}
public void display() 
{
System.out.println("Product Code: " + pcode);
System.out.println("Product Name: " + pname);
System.out.println("Price: " + price);
}
public static void main(String[] args) 
{
Product product1 = new Product(101, "Product1", 150.0);
Product product2 = new Product(102, "Product2", 200.0);
Product product3 = new Product(103, "Product3", 100.0);
Product[] products = {product1, product2, product3};
Product lowestPriceProduct = products[0];
for (int i = 1; i < products.length; i++)
 {
if (products[i].price < lowestPriceProduct.price) {
lowestPriceProduct = products[i];
}
}
System.out.println("\nProduct with the lowest price:");
lowestPriceProduct.display();
}
}

