package generic;

public class Pair <A, B> {
    public final A first;
    public final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    Pair <String , Pair<String, Integer>> pair = new Pair<>("hello", new Pair<>("H", 10));
    Pair <Double, Double> douplePair = new Pair<>(1.5, 2.0 );
}
