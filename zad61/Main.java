package zad61;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Czerwony ");
        linkedList.add("Niebieski");
        linkedList.add("Fioletowy");
        linkedList.add("Zielony");
        System.out.println("lista: " + linkedList);

        String pierwszyElement = linkedList.removeFirst();
        String ostatniElement = linkedList.removeLast();

        System.out.println("Elementy usuniete: " + pierwszyElement + ostatniElement);

        System.out.println("Lista po usunięciu elementów: " + linkedList);
    }
}