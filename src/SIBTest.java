/**
 * Created by dev on 23/11/2015.
 */
public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    } //there is no limit on the number of static initialization blocks that can exist. Are called in the order
    // they are declared in the class. When running the class contents, all static initialization blocks are run before
    // any other code. For readability, this is likely not a good format since the second block here is after the
    // constructor, but just to demonstrate in the Main how this works.

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
