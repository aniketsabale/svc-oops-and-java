package Abstraction;

abstract class RBI {
    float repoRate=2;
    abstract protected String getRateofIntrest();

    String getRepoRate() {
        return "RepoRate is 1.5%";
    }

    static String getName() {
        return "RBI";

    }

}

class AxisBank extends RBI {

    float repoRate=3;

    @Override
    public String getRateofIntrest() {
        return "RateofIntrest for Axis Bank is " + 7 + "%";
    }
}

class StateBank extends RBI {
    float repoRate=4;
    @Override
    public String getRateofIntrest() {
        return "RateofIntrest for State Bank is " + 8 + "%";
    }
}

public class Abstract {
    //    Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//    A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
//    Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.
//Points to Remember
//    1. An abstract class must be declared with an abstract keyword.
//    2. It can have abstract and non-abstract methods.
//    3. It cannot be instantiated.
//    4.It can have constructors and static methods also.
//    5.It can have final methods which will force the subclass not to change the body of the method.
    public static void main(String ss[]) {
        RBI rbi = new AxisBank();
        AxisBank axisBank=new AxisBank();
        StateBank stateBank = new StateBank();

        System.out.println(rbi.getRateofIntrest());
        System.out.println(stateBank.getRateofIntrest());
        System.out.println(rbi.getRepoRate());
        System.out.println(RBI.getName());
        System.out.println(rbi.repoRate);
        System.out.println(stateBank.repoRate);
        System.out.println(axisBank.repoRate);

    }

}
