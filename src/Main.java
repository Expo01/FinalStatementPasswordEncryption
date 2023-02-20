public class Main {

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one"); //new SomeClass objects created
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber()); //static field along with final int variable such that each object
        // is assigned a permanent value frm the count when object was created
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4; can't do this
//        System.out.println(Math.PI);
//        Math m = new Math(); // can't do this either since its final class
//
        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword(); // password field set to encrypted value of my input, in this case, the Password class
        // uses the XOR operator '^' which in this circumstance takes the key value and subtracts my password value and
        //returns the remainder. However, if I change the password and key values, this logic does not hold. Not sure
        // how, but the password is manipulated in different ways to encrypt it. However, the way that a single password
        // is altered is constant, so when I input my password again to 'login' it encryptor/decryptor shows I'm correct
        //this is a bitwise XOR which somehow checks boolaen at each position? Not going to spend a lot of time here.

//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);
//
//        System.out.println("Main method called");
//        SIBTest test = new SIBTest();
//        test.someMethod();
//        System.out.println("Owner is " + SIBTest.owner);
    }
}
