package Encapsulation;

//A Java class which is a fully encapsulated class.
//It has a private data member and getter and setter methods.
 class Student{
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsulation {
//    Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
//    We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

//    Advantage of Encapsulation in Java
//    1.By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.
//    2.It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
//    3.It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
//    4.The encapsulate class is easy to test. So, it is better for unit testing.
//    5.The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.

    public static void main(String aa[]){
        Student student=new Student();
        student.setName("Aniket");

        System.out.println("Name we set from setter is-> "+student.getName());
    }

}
