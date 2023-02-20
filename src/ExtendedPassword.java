/**
 * Created by dev on 23/11/2015.
 */
public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
    //danger of non-final methods such as over-riding the storePassword method from Password super class but modifying it
    // and other methods such that, above, we set the decrypted password to the value of a non-encrypted password, but
    // the confirmation method says its all good.

    //really I think it would be bettr just to mak thee whol Password class final so I can't circumvent the encrpytion too
    // not just the confirmation message 
}
