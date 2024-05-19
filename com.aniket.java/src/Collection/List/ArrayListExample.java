package Collection.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListExample {
//Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.
//The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList maintains the insertion order internally.
//The important points about the Java ArrayList class are:
//Java ArrayList class can contain duplicate elements.
//    1. Java ArrayList class maintains insertion order.
//    2. Java ArrayList class is non synchronized.
//    3. Java ArrayList allows random access because the array works on an index basis.
//    4. In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
//    5. We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.
//    6. Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.
    public static void main(String jj[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(9); // adding new element in arrayList
        arrayList.set(0,5); //It is used to replace the specified element in the list, present at the specified position.
        arrayList.add(1,40); //adding element on specific position of arrayList
        arrayList.addAll(new ArrayList<Integer>()); //It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator
        arrayList.addAll(1,new ArrayList<>()); //It is used to append all the elements in the specified collection, starting at the specified position of the list.
        arrayList.get(0); //It is used to fetch the element from the particular position of the list.
        arrayList.isEmpty(); //It returns true if the list is empty, otherwise false.
        Iterator<Integer> integers= arrayList.iterator(); //it is use to iterate elements of List
        arrayList.clone(); //It is used to return a shallow copy of an ArrayList.
        arrayList.contains(9); //It returns true if the list contains the specified element.
        arrayList.indexOf(9); //It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
        arrayList.remove(0); //It is used to remove the element present at the specified position in the list
        arrayList.remove(Integer.valueOf(9)); //It is used to remove the first occurrence of the specified element.
        arrayList.add(90);
        arrayList.add(6);
        arrayList.sort(Integer::compareTo); //It is used to sort the elements of the list on the basis of the specified comparator.
        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder()); //It is used to sort the elements of the list on the basis of the specified comparator.
        System.out.println(arrayList);
        arrayList.size(); //It is used to return the number of elements present in the list.





    }



}
