/**
 * 
 */
package com.tvd12.ezyfox.core.entities;

import java.util.List;
import java.util.Map;

/**
 * Hold disconnection information
 * 
 * @author tavandung12
 *
 */
public interface ApiDisconnection {

    /**
     * @param <T> the user type
     * @return the user
     */
    <T extends ApiBaseUser> T user();
    
    /**
     * 
     * @return the zone
     */
    ApiZone zone();
    
    /**
     * @param <T> the room type
     * @return the list of Rooms previously joined by the User ( List or Room )
     */
    <T extends ApiRoom> List<T> joinedRooms();
    
    /**
     * @param <T> the room type
     * @return a map of PlayerId by Room, for each Room joined by the User ( Map of Room, Integer)
     */
    <T extends ApiRoom> Map<T, Integer> playerIdsByRoom();
    
    /**
     * @return the reason of the disconnection (where it is possible to detect it)
     */
    String reason();
    
    
}
