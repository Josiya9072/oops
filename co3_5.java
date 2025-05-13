import java.util.*;
import java.io.*;
interface Sports {
    public void sports_getData();
    public void sports_dispData();
}
class Student {
    String name;
    String roll_no;
    float mark1;

    Student(String name,String roll, float m1) {
        this.name = name;
        this.roll_no = roll;
        this.mark1 = m1;
    }
    void display() {
        System.out.println("Student Details");
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No. of Student: " + roll_no);
        System.out.println("Marks of Subject: " + mark1);
    }
}

class Result extends Student implements Sports {
  String item;
  int rank;
  Scanner sc = new Scanner(System.in);
  Result(String n, String r, float m1) {
        super(n, r, m1);
    }
    public void sports_getData() {
        System.out.print("Enter the sports item which student participated : ");
        item = sc.nextLine();
        System.out.print("Enter the rank position that the obtained : ");
        rank = sc.nextInt();
    }
    public void sports_dispData() {
        System.out.println("sports Info");
        System.out.println("Item :" + item);
        System.out.println("Rank  :" + rank);
    }
}

class co3_5 {
    public static void main(String args[]){
        Result re = new Result("rahbar","vda39",89);
        re.sports_getData();
        re.display();
        re.sports_dispData();
    }
}