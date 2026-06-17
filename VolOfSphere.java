import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double r = sc.nextDouble();
        //Volume of Sphere 4/3*pi*r*r*r
        
        double V = (4.0/3.0)*3.1415*r*r*r;
        System.out.println(V);
    sc.close();
    }
    
}
