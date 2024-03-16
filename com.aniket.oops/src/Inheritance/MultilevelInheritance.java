package Inheritance;

class Cars{
    String carType ="Hashbag";
    String getdetails(){
        String str="carType- "+carType;
        return str;
    }
}
class Suzuki extends Cars{
    String brandName ="Suzuki";
    Cars cars=new Cars();
    String getdetails(){
        String str="brandName- "+brandName+" "+cars.getdetails();
        return str;
    }
}
class SwiftDezire extends Suzuki{
    String colour ="Red";
    int price =1250000;
    Suzuki suzuki=new Suzuki();
    String getdetails(){
        String str="colour-"+colour +" and "+"price-"+price+" "+suzuki.getdetails();
        return str;
    }

}
public class MultilevelInheritance {
//    When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, SwiftDezire class inherits the Suzuki class which again inherits the Cars class, so there is a multilevel inheritance.

    public static  void main(String ss[]){
        SwiftDezire swiftDezire=new SwiftDezire();
        System.out.println(swiftDezire.getdetails());
    }
}
