package Collection.Set;

import java.util.TreeSet;

public class TreeSetExample {
//    The important points about the Java TreeSet class are:
//    1. Java TreeSet class contains unique elements only like HashSet.
//    2. Java TreeSet class access and retrieval times are quiet fast.
//    3. Java TreeSet class doesn't allow null element.
//    4. Java TreeSet class is non synchronized.
//    5. Java TreeSet class maintains ascending order.
//    6. Java TreeSet class contains unique elements only like HashSet.
//    7. Java TreeSet class access and retrieval times are quite fast.
//    8. Java TreeSet class doesn't allow null elements.
//    9. Java TreeSet class is non-synchronized.
//    10. Java TreeSet class maintains ascending order.
//    11. The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.

    public static void main(String ff[]){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(6);
        treeSet.add(3); treeSet.add(89);
        treeSet.add(7);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
