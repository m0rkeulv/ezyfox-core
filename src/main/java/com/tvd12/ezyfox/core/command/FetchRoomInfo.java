/**
 * 
 */
package com.tvd12.ezyfox.core.command;

import java.util.List;

import com.tvd12.ezyfox.core.entities.ApiBaseUser;
import com.tvd12.ezyfox.core.entities.ApiGameUser;
import com.tvd12.ezyfox.core.entities.ApiUser;
import com.tvd12.ezyfox.core.entities.ApiZone;

/**
 * Execute this command to fetch information of a room
 * 
 * @author tavandung12
 *
 */
public interface FetchRoomInfo {
    
    /**
     * Checks if the specified User is joined in the Room
     * 
     * @param username the user name
     * @return true or false
     */
    boolean containsUser(String username);
    
    /**
     *  Checks if the specified User is joined in the Room
     * 
     * @param user the user
     * @return true or false
     */
    boolean containsUser(ApiBaseUser user);
    
    /**
     * Checks if a certain Room Variable name exists
     * 
     * @param varname variable name
     * @return true of false
     */
    boolean containsVariable(String varname);
    
    /**
     * Obtain the time of existence of the Room
     * 
     * @return the life time of the room
     */
    long getLifeTime();
    
    /**
     * For Game Rooms: get all Players in the Room (same as all User without the Spectators)
     * 
     * @param <T> the user type
     * @return list of spectators
     */
    <T extends ApiUser> List<T> getSpectatorsList();
    
    /**
     * For Game Rooms: get all Players in the Room (same as all User without the Spectators)
     * 
     * @param clazz class of game user
     * @param <T> the game user type
     * @return list of spectators
     */
    <T extends ApiGameUser> List<T> getSpectatorsList(Class<?> clazz);
    
    /**
     * For Game Rooms: get all Spectators in the Room (same as all User without the Players)
     * 
     * @param <T> the user type
     * @return list of player without spectators
     */
    <T extends ApiUser> List<T> getPlayersList();
    
    /**
     * For Game Rooms: get all Spectators in the Room (same as all User without the Players)
     * 
     * @param <T> the game user type
     * @param clazz class of game user
     * @return list of player without spectators
     */
    <T extends ApiGameUser> List<T> getPlayersList(Class<?> clazz);
    
    /**
     * Get all Users in the Room
     * 
     * @param <T> the user type
     * @return all user in room
     */
    <T extends ApiUser> List<T> getUserList();
    
    /**
     * Get all Users in the Room
     * 
     * @param <T> the game user type
     * @param clazz class of game user
     * @return all user in room
     */
    <T extends ApiGameUser> List<T> getUserList(Class<?> clazz);
    
    /**
     * Get the total amount of Room Variables for this Room
     * 
     * @return the total amount of Room Variables for this Room
     */
    int getVariablesCount();
    
    /**
     *  Get the Zone managing this Room.
     * 
     * @return the Zone managing this Room.
     */
    ApiZone getZone();
    
    /**
     *  Checks whether the Room is empty
     * 
     * @return true or false
     */
    boolean isEmpty();
    
    /**
     * Checks whether the Room is full.
     * 
     * @return true or false
     */
    boolean isFull();
    
    /**
     * Checks if the Room requires a password for joining it
     * 
     * @return true or false
     */
    boolean isPasswordProtected();
    
    /**
     * Return true if the Room is active in the Zone. 
     * When a Room is not active it will refuse any join request
     * 
     * @return true or false
     */
    boolean isActive();
    
}
