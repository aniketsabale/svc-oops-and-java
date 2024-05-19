package Abstraction;

interface Bank{
    float reopRate = 1.5f;
    String getRateOfIntrest();
}
class Axis implements Bank{
    static float reopRate = 1.6f;
    @Override
    public String getRateOfIntrest() {
        return "RateofIntrest for Axis Bank is " + 7 + "%";
    }
}

class BOI implements Bank {
    float reopRate = 1.7f;
    @Override
    public String getRateOfIntrest() {
        return "RateofIntrest for BOI is " + 8.2 + "%";
    }
}
public class Interface {
//    An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//    The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
//    In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
//    Java Interface also represents the IS-A relationship.
//    1. It cannot be instantiated just like the abstract class.
//    2. Since Java 8, we can have default and static methods in an interface.
//    3. Since Java 9, we can have private methods in an interface.
//    There are mainly three reasons to use interface. They are given below.
//    1. It is used to achieve abstraction.
//    2. By interface, we can support the functionality of multiple inheritance.
//    3. It can be used to achieve loose coupling.
    public static void main(String dd[]){
        Bank bank = new Axis();
        BOI boi = new BOI();
        Axis axis =new Axis();
        System.out.println(bank.getRateOfIntrest());
        System.out.println(boi.getRateOfIntrest());
        System.out.println(boi.reopRate);
        System.out.println(axis.reopRate);
        System.out.println(Bank.reopRate);
    }


}
