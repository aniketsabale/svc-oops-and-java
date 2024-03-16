package polymorphism;

class Example{
    int age =27;
    String Name ="Aniket";

    public Example(int age, String name) {
        this.age = age;
        Name = name;
    }

    public Example() {

    }

    Example getNameAndAge(){
        return new Example();
    }

    Example getNameAndAge(int age,String name){
        return new Example(age,name);
    }



}
public class FunctionOverLoading {
//    Polymorphism in Java is a concept by which we can perform a single action in different ways
public static void main(String arf[]){
    Example example = new Example();
    Example obj1= example.getNameAndAge();
    System.out.println("Calling non-prameterised function "+" Name -"+obj1.Name+" Age-"+obj1.age);
    System.out.println();
     obj1= example.getNameAndAge(24,"suhas");
    System.out.println("Calling prameterised function "+" Name -"+obj1.Name+" Age-"+obj1.age);
}

}
