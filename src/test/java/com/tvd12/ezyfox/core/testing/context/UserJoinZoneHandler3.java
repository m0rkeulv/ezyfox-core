package com.tvd12.ezyfox.core.testing.context;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.annotation.ZoneName;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiZone;

@ZoneName("zzz")
@ServerEventHandler(event = ServerEvent.USER_JOIN_ZONE)
public class UserJoinZoneHandler3 {

    public void handle(AppContext context, ApiZone zone, PokerUser user) {
        
    }
    
}
