import java.util.TreeSet;

public class TreeSetClone {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");

        TreeSet<String> set2 = new TreeSet<>(set1);
        System.out.println(set2);
    }
}
