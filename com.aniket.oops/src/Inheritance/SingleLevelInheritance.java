package Inheritance;
class Car{
    String carType ="Hashbag";
    String getdetails(){
        String str="carType- "+carType;
        return str;
    }
}
class Swift extends Car {
    String colour ="Red";
    int price =950000;
    String getdetails(){
        String str="colour-"+colour +" and "+"price-"+price ;
        return str;
    }

}
public class SingleLevelInheritance {
    public static void main(String sd[]){
        Swift obj1=new Swift();
        System.out.println(obj1.getdetails());
    }
}
