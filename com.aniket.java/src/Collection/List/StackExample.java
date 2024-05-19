package Collection.List;

import java.util.Stack;

public class StackExample {
//    In Java, Stack is a class that falls under the Collection framework that extends the Vector class. It also implements interfaces List, Collection, Iterable, Cloneable, Serializable. It represents the LIFO stack of objects. Before using the Stack class, we must import the java.util package. The stack class arranged in the Collections framework hierarchy, as shown below.
//    We can perform push, pop, peek and search operation on the stack. The Java Stack class provides mainly five methods to perform these operations. Along with this, it also provides all the methods of the Java Vector class.
public  static void main(String jj[]){
    Stack<Integer> stack = new Stack<>();

    stack.push(7); //The method pushes (insert) an element onto the top of the stack.
    stack.pop(); //The method removes an element from the top of the stack and returns the same element as the value of that function.
    stack.peek(); //The method looks at the top element of the stack without removing it.
    stack.search(7); //The method searches the specified object and returns the position of the object.

}

}
