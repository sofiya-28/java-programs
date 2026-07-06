public class ShallowInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] x = arr; //x is shallow copy of aaray 
        x[0]=99;
        System.out.println(arr[0]);

    }
}
