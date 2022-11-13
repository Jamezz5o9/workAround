import java.util.Arrays;

public class CheckSomething {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        check(arr);
        secondCheck(arr);
    }

    private static void secondCheck(int[] arr) {
        int[] storeArr = new int[arr.length];
        int newArr = arr.length - 1;
        int count = 0;
        for(int i = newArr; i >= 0; i--){
            storeArr[count++] += arr[i];
        }
        System.out.println(Arrays.toString(storeArr));
    }

    private static void check(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] += arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
