class Employee{
  int id;
  String name;
  int sal;
  String address;
  
  Employee(int id,String name,int sal,String address){
    this.id=id;
    this.name=name;
    this.sal=sal;
    this.address=address;
  }
  
  public void display(){
      System.out.println("Employee id: "+this.id);
      System.out.println("Employee name: "+this.name);
      System.out.println("Employee salary: "+this.sal);
      System.out.println("Employee address: "+this.address);
    }
  
 }
 
  class teacher extends Employee{
    String dept;
    String sub;
    
    teacher(int id,String name,int sal,String address,String dept,String sub){
     super(id,name,sal,address);
     this.dept=dept;
     this.sub=sub;
     }
     public void display(){
         super.display();
         System.out.println("department: "+this.dept);
         System.out.println("subject: "+this.sub);
       }
     
   }
   
   class co3_2{
     public static void main(String[] args){
       teacher[] t = new teacher[2];
       t[0]=new teacher(101,"deepa",30000,"vatakara","mca","networking");
       t[1]=new teacher(102,"shahil",40000,"malappuram","cse","java");
       t[0].display();
       t[1].display();
      }
   }