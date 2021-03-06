package com.tvd12.ezyfox.core.command;

/**
 * Run this command to get an user
 * 
 * @author tavandung12
 *
 */

public interface FindUser {

    /**
     * Get user by name
     * 
     * @param <T> the user type
     * @param name the user name
     * @return user reference
     */
	<T> T by(String name);
	
	/**
	 * Get user by id
	 * 
	 * @param <T> the user type
	 * @param userId user id
	 * @return user reference
	 */
	<T> T by(int userId);
	
}
