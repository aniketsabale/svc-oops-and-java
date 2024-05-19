package Collection.List;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListExample {
//    The important points about Java LinkedList are:
//    1. Java LinkedList class can contain duplicate elements.
//    2. Java LinkedList class maintains insertion order.
//    3. Java LinkedList class is non synchronized.
//    4. In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//    5. Java LinkedList class can be used as a list, stack or queue.

   public static void main(String ff[]){
       LinkedList<Integer> integers = new LinkedList<>();
// for Adding Data in List
       integers.add(9); //It is used to append the specified element to the end of a list.
       integers.addFirst(8); //It is used to insert the given element at the beginning of a list.
       integers.addLast(6); //It is used to append the given element to the end of a list.

// for Adding Data in List
       integers.offer(9); //It adds the specified element as the last element of a list.
       integers.offerFirst(4); //It inserts the specified element at the front of a list.
       integers.offerLast(3); //It inserts the specified element at the end of a list.
       System.out.println(integers);

// for fetching Data from List
       integers.get(0); //It is used to return the element at the specified position in a list.
       integers.getFirst(); //It is used to return the first element in a list.
       integers.getLast(); //It is used to return the last element in a list.

// for fetching Data from List
       integers.peek(); //It retrieves the first element of a list
       integers.peekFirst(); //	It retrieves the first element of a list or returns null if a list is empty.
       integers.peekLast(); //It retrieves the last element of a list or returns null if a list is empty.

// for fetching and deleting Data from List
       integers.poll(); //It retrieves and removes the first element of a list.
       integers.pollFirst(); //It retrieves and removes the first element of a list, or returns null if a list is empty.
       integers.pollLast();  //It retrieves and removes the last element of a list, or returns null if a list is empty.

// for fetching and deleting Data from List
       integers.remove(); //It is used to retrieve and removes the first element of a list.
       integers.removeFirst(); //It removes and returns the first element from a list.
       integers.removeLast(); //It removes and returns the last element from a list.

// for Stack oprations
       integers.push(8);//It pushes an element onto the stack represented by a list.
       integers.pop(); //It pops an element from the stack represented by a list.








   }
}
