package co1105.cw2.mr414;

public class InvalidActivityException extends Exception{
    public InvalidActivityException () {
        super(); // calls the base Exception class constructor
    }

    public InvalidActivityException (String msg) {
        super(msg); // just call the base Exception class constructor
    }


}
