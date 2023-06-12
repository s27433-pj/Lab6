package zad62;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("pierwszy");
        set.add("drugi");
        set.add("Trzeci");
        set.add("czwarty");
        System.out.println("Zawartość zbioru: " + set);

        String[] array = set.toArray(new String[0]);

        System.out.println("Zawartość tablicy: ");
        for (String Element : array) {
            System.out.println(Element);
        }
    }
}





