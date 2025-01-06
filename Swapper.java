public class Swapper {
    public static <T> void doSwap(T a, T b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Integer x = 10, y = 20;
        doSwap(x, y);
    }
}
