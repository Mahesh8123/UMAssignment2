import java.util.Arrays;

public class ToStringOverride {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 4 };

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
