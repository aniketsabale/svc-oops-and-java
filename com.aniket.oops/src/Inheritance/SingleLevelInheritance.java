package Inheritance;
class Car{
    String carType ="Hashbag";
    String getdetails(){
        String str="carType- "+carType;
        System.out.println("calling car");
        return str;
    }
}
class Swift extends Car {
    String colour ="Red";
    int price =950000;
    String getdetails(){
        String str="colour-"+colour +" and "+"price-"+price ;
        System.out.println("calling Swift");
        return str;
    }

}
public class SingleLevelInheritance {
    public static void main(String sd[]){
        Swift obj1=new Swift();
        Car car =new Swift();
        Car car1=new Car();
        System.out.println(obj1.getdetails());
        System.out.println(car.getdetails());
        System.out.println(car1.getdetails());
    }
}
