import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r=sc.nextFloat();

        double a=3.1415*r*r;
        System.out.println(a);

    sc.close();
        
    }
    
}
