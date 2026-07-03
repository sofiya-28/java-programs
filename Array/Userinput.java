package Array;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element ");
        int[] sofiya= new int[5];
        //input 
        for(int i=0;i<5;i++){
            sofiya[i]= sc.nextInt();

        }
        // output
        for(int i=0;i<5;i++){
            System.out.print(sofiya[i]+" ");

        }
    sc.close();
    }
    
}
