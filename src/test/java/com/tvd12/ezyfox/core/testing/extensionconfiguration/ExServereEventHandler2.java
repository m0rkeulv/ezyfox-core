package com.tvd12.ezyfox.core.testing.extensionconfiguration;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.content.AppContext;

@ServerEventHandler(event = "login2")
public class ExServereEventHandler2 {

    public void handle(AppContext context) {}
    
}
