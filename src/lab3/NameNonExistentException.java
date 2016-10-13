/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Alec
 */
public class NameNonExistentException extends Exception {
    private static String msg = "What you have entered is not valid!";

    public NameNonExistentException() {
        super(msg);
    }

    public NameNonExistentException(String message) {
        super(msg);
    }

    public NameNonExistentException(String message, Throwable cause) {
        super(msg, cause);
    }

    public NameNonExistentException(Throwable cause) {
        super(cause);
    }

    public NameNonExistentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
    
}
