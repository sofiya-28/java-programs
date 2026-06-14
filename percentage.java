import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //input marks
        System.out.println("Enter the marks of subject 1 :");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2 :");
        int s2 =sc.nextInt();
        System.out.println("Enter the marks of subject 3 :");
        int s3 =sc.nextInt();
        System.out.println("Ente rthe marks of subject 4 :");
        int s4=sc.nextInt();
        System.out.println("Enter the marks of subject 5 :");
        int s5 = sc.nextInt();
        //total marks obtain
         int total = s1+s2+s3+s4+s5;
        // calculate percentage
         double percentage =(total/500.0)*100;
         //output
         System.out.println("total marks"+total);
         System.out.println("Total percentage"+percentage+"%");
         sc.close();
    }
    
}
