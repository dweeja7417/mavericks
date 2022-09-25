
package com.code.exception;

public class InvalidUserException extends Exception {
    
	public InvalidUserException(String message) 
    { 
        // Call constructor of parent Exception 
        super(message); 
    } 

}
