import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }

    static Employee searchEmployee(Employee[] employees, int searchNo) {
        for (Employee emp : employees) {
            if (emp.eNo == searchNo) {
                return emp; 
            }
        }
        return null;
    }
}

public class EmployeeApp { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Employee Name: ");
            String eName = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double eSalary = sc.nextDouble();
            sc.nextLine();
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();

        Employee foundEmployee = Employee.searchEmployee(employees, searchNo);

        if (foundEmployee != null) {
            System.out.println("\nEmployee Found:");
            foundEmployee.display();
        } else {
            System.out.println("\nEmployee with Employee Number " + searchNo + " not found.");
        }
        sc.close();
    }
}

