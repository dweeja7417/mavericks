
package com.code.dao;



import com.code.bean.User;
import com.code.exception.InvalidUserException;

public interface UserDao {

	//function to validate user
	User validateUser(String userName, String password) throws InvalidUserException;

}
