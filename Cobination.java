import java.util.Scanner;

public class Cobination {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f *=i;
        }
        return f;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int ncr= fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);

    }
    
}
