import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();
        cards.add("A");
        cards.add("B");
        cards.add("C");
        cards.add("D");

        boolean a = cards.stream().anyMatch(card -> card.equals("A"));

        System.out.println(a);
    }
}
