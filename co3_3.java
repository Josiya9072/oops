class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age, int empId,
             String companyName, String qualification, int salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    String teacherId;

    Teacher(String name, String gender, String address, int age, int empId,
        String companyName, String qualification,int salary,
        String subject, String department, String teacherId) {

        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + empId);
        System.out.println("Company: " + companyName);
        System.out.println("Qualification : " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class co3_3{
    public static void main(String[] args) {


        Teacher[] teachers = new Teacher[2];
        teachers[0]= new Teacher("amal","male","vadakara",32,1001,"eduport","msc",45000,"maths","science","T101");
        teachers[1]= new Teacher("shahana","female","calicut",29,1002,"xylem","phd",50000,"physics","science","T103"); 
        teachers[0].display();
        teachers[1].display();
    }
}