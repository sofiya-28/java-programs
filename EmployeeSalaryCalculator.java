import java.util.Scanner;
public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic Salary");
        double basicSalary = sc.nextDouble();
        
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;

        double totalSalary = basicSalary + hra + da;

        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Total Salary : " + totalSalary);

    sc.close();

    }
}
    