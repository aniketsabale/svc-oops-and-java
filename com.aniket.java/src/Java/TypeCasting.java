package Java;

public class TypeCasting {

//    There are two types of type casting:
//    1. Widening Type Casting/implicit Casting
//    2. Narrowing Type Casting/explicit Casting

//    1. Widening Type Casting/implicit Casting
//    byte -> short -> char -> int -> long -> float -> double

//    2. Narrowing Type Casting/explicit Casting
//    double -> float -> long -> int -> char -> short -> byte
public static void main(String args[]){

//    1. Widening Type Casting/implicit Casting
    int anInt=4;
    float aFloat=anInt;
    System.out.println("Int value is "+anInt);
    System.out.println("float value is "+aFloat);

//    2. Narrowing Type Casting/explicit Casting
    float anFloat= 3.68f;
    int aInt = (int)anFloat;
    System.out.println("float value is "+anFloat);
    System.out.println("Int value is "+aInt);



}






}
