import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator_1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");

        for (String s : set) {
            System.out.println(s);
        }

        Iterator <String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
