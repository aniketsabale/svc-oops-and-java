package Inheritance;
 class cars{
    String carType ="Hashbag";
    String getdetails(){
        String str="carType- "+carType;
        return str;
    }
}
class suzuki extends cars{
    String brandName ="Suzuki";
    cars cars=new cars();
    String getdetails(){
        String str="brandName- "+brandName+" "+cars.getdetails();
        return str;
    }
}
class Tata extends cars{
    String brandName ="TATA";
    cars cars=new cars();
    String getdetails(){
        String str="brandName- "+brandName+" "+cars.getdetails();
        return str;
    }

}
public class HierarchicalInheritance {

//    When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, suzuki and Tata classes inherits the cars class, so there is hierarchical inheritance.
    public static  void main(String ss[]){
        suzuki suzuki =new suzuki();
        System.out.println(suzuki.getdetails());

        Tata tata =new Tata();
        System.out.println(tata.getdetails());
    }
}
