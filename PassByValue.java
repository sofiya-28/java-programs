public class PassByValue {
    public static void tum(int x){
        x= 20;
    }
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
        tum(x);
        System.out.println(x);
    }
    
}
