package Java;

public class DataTypes {
//    There are 8 types of primitive data types:
//    dataType   size        default                Range
//    1. byte    -1 bytes       0                -128 to 127 (inclusive)
//    2. boolean -1           false             true/false
//    3. short   -2            0                -32,768 to 32,767 (inclusive)
//    4. char    -2          '\u0000'           '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
//    5. int     -4            0                - 2,147,483,648 to 2,147,483,647
//    6. float   -4            0.0f              range is unlimited
//    7. long    -8            0l               - 9,223,372,036,854,775,808 to  9,223,372,036,854,775,807
//    8. double  -8            0.0d             range is unlimited
    byte aByte;
    boolean aBoolean;
    short aShort;
    char aChar;
    int anInt;
    float aFloat;
    long aLong;
    double aDouble;

    public static void main(String ss[]){
        DataTypes dataTypes=new DataTypes();
        System.out.println("Default value of byte is "+dataTypes.aByte);
        System.out.println("Default value of boolean is "+dataTypes.aBoolean);
        System.out.println("Default value of short is "+dataTypes.aShort);
        System.out.println("Default value of char is "+dataTypes.aChar);
        System.out.println("Default value of int is "+dataTypes.anInt);
        System.out.println("Default value of float is "+dataTypes.aFloat);
        System.out.println("Default value of long is "+dataTypes.aLong);
        System.out.println("Default value of double is "+dataTypes.aDouble);
    }

}
