package Collection.Set;

import java.util.HashSet;

public class HashSetExample {

//    Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
//    The important points about Java HashSet class are:
//    1. HashSet stores the elements by using a mechanism called hashing.
//    2. HashSet contains unique elements only.
//    3. HashSet allows null value.
//    4. HashSet class is non synchronized.
//    5. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//    6. HashSet is the best approach for search operations.
//    7. The initial default capacity of HashSet is 16, and the load factor is 0.75.

    public static void main(String kk[]){
        HashSet<Integer> hashSet = new HashSet<>();

//        here we don't have get functionality to fetch object
//        here we need to use itrator for fetching elements

        hashSet.add(8); //It is used to add the specified element to this set if it is not already present.
        hashSet.contains(8); //It is used to return true if this set contains the specified element.
        hashSet.size(); //It is used to return the number of elements in the set.
        hashSet.remove(8); //It is used to remove the specified element from this set if it is present.
        hashSet.clear(); //It is used to remove all of the elements from the set.

    }

}
