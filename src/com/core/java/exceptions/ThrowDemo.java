package com.core.java.exceptions;

import java.sql.SQLException;

import com.core.java.excpetions.UserNotFoundException;

// throw -> create new exception and throws - mention what exception i am throwing
public class ThrowDemo {

	// service layer
	public static void retrieveUser(String username) throws UserNotFoundException, RuntimeException {
		try {
			// consider getting data from db and there is no data in db
			throw new SQLException();
		} catch (SQLException e) {
			System.out.println("Caught inside");
			throw new UserNotFoundException("THis is user is not present for id " + username);
		}
	}

	// controller layer
	public static void main(String[] args) {
		try {
			retrieveUser("Ravi");
		} catch (UserNotFoundException e) {
			// "User is noit found in our system" -> set this message in the request
		}

	}

}
