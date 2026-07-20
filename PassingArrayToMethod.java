public class PassingArrayToMethod {
    public static void main(String[] args){
        int[] X= {10,20,30,40,50,60};
        System.out.println(X[3]);
        change(X);
        System.out.println(X[2]);
    }
    public static void change(int[] X){
        X[2]=99;
    }    
}
