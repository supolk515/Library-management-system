package OOP;

public class Array {
    private Array(){
    }

    public static int[] getArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1){
                System.out.print("," + " ");
            }
        }
        System.out.println("]");
        return arr;
    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (sum * 1.00)/arr.length;
    }
}
