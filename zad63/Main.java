package zad63;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Szary");
        tree1.add("Bialy");
        tree1.add("Niebieski");
        tree1.add("Żółty");
        tree1.add("Brazowy");

        System.out.println("Elementy drzewa tree1:");
        for (String element : tree1) {
            System.out.println(element);
        }

        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Biały");
        tree2.add("Fioletowy");
        tree2.add("Pomarańczowy");

        System.out.println("Elementy drzewa tree2:");
        for (String element : tree2) {
            System.out.println(element);
        }

        tree1.addAll(tree2);

        System.out.println("Elementy drzewa tree1 (odwrotna kolejność):");
        for (String element : tree1.descendingSet()) {
            System.out.println(element);
        }

        System.out.println("Pierwszy element  tree1: " + tree1.first());
        System.out.println("Ostatni element tree1: " + tree1.last());

        TreeSet<String> tree3 = new TreeSet<>(tree1);

        System.out.println("Liczba elementów w  tree1: " + tree1.size());

        boolean czyRowne = tree1.equals(tree2);

        System.out.println("Czy tree1 i tree2 są takie same? " + czyRowne);
    }
}