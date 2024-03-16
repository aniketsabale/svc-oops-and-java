 class Example {
    String name;
    int age;

//    Type of constructors
//     1. non-paramerised/default constructor
//     2. parameterised constructor
//     3.coppy constructor

//     1. non-paramerised/default constructor
     Example(){
         this.name="Aniket";
         this.age=24;
     }

     //     2. parameterised constructor
     Example(String name,int age){
         this.name=name;
         this.age=age;
     }

     //     3.coppy constructor
     Example(Example example){
         this.name=example.name;
         this.age=example.age;
     }

}

public class TypeOfConstructors
{
    public static void main(String ard[]){
        //     1. using non-paramerised/default constructor
        Example obj1 =new Example();
        System.out.println("using non-paramerised/default constructor with obj1");
        System.out.println(obj1.name+"  "+obj1.age);

        //     2. using parameterised constructor
        Example obj2 =new Example("Suhas",25);
        System.out.println("using paramerised constructor with obj2");
        System.out.println(obj2.name+"  "+obj2.age);

        //     3.using coppy constructor
        Example obj3 =new Example(obj1);
        System.out.println("using coppy constructor with obj3");
        System.out.println(obj3.name+"  "+obj3.age);
    }
}
