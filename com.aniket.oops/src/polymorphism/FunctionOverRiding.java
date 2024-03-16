package polymorphism;
class Car{
    String carType ="Hashbag";
    String getdetails(){
        String str="carType- "+carType;
        return str;
    }
}
class Swift extends Car{
    String colour ="Red";
    int price =950000;
    String getdetails(){
        String str="colour-"+colour +" and "+"price-"+price ;
        return str;
    }

}

public class FunctionOverRiding {
//    1. If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//       In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
//   2. If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.

//   3. Rules for Java Method Overriding
//    a. The method must have the same name as in the parent class
//    b. The method must have the same parameter as in the parent class.
//    c. There must be an IS-A relationship (inheritance).

    public static void main(String ss[]){
//        this will call child method
        Swift swift=new Swift();
        System.out.println(swift.getdetails());

//        this will also call child method
        Car car =new Swift();
        System.out.println(car.getdetails());

//        this will call parent method
        Car car1=  new Car();
        System.out.println(car1.getdetails());

    }
}
