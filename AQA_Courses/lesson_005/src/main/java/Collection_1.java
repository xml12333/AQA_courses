import java.util.*;

public class Collection_1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        Map<String, String> map = new HashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();

        /*  Collection  */

//        collection.add("one");
//        collection.add("two");
//        collection.add("three");
//
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println();
//
//        System.out.println("Collection size is: " + collection.size());
//        collection.remove("two");
//        System.out.println("Removed element");
//        System.out.println("Collection size is: " + collection.size() + "\n");
//
//
//        System.out.println(collection.contains("two"));
//        System.out.println(collection.contains("one") + "\n");
//
//        for (String s:collection) {
//            System.out.println(s);
//        }

        /*  List  */

//        list.add("one");
//        list.add("two");
//        list.add("three");
//        System.out.println(list.get(2));
//        System.out.println("Collection size is: " + list.size());

        /*  Set  */
        // sorted

//        set.add("one");
//        set.add("one");
//        set.add("one");
//        set.add("two");
//        set.add("three");
//        set.add(null);
//        System.out.println("Set size is: " + set.size());
//        for (String s : set) {
//            System.out.println(s);
//        }

        /*  Queue  */

//        queue.add("one");
//        queue.add("one");
//        queue.add("two");
//        queue.add("three");
//        System.out.println(" queue size is : " + queue.size());
//        queue.remove("three");
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        /*  Map  */

        map.put("1", "Volvo");
        map.put("2", "Zaz");
        map.put("3", "BMW");
        map.put(null, "Renault");
        System.out.println(map.get(null));
        System.out.println(map.get("3"));
        treeMap.put("3", "BMW");
        treeMap.put(null, "Renault");
        System.out.println(treeMap.get(null));
    }
}
