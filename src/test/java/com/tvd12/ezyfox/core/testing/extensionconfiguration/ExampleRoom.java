package com.tvd12.ezyfox.core.testing.extensionconfiguration;

import com.tvd12.ezyfox.core.annotation.ParamsMapper;
import com.tvd12.ezyfox.core.annotation.ResponseParam;
import com.tvd12.ezyfox.core.annotation.ResponseParams;
import com.tvd12.ezyfox.core.annotation.RoomAgent;
import com.tvd12.ezyfox.core.entities.ApiRoom;

@RoomAgent
@ResponseParams
@ParamsMapper(deserializer = ExampleRoomDeserializer.class)
public class ExampleRoom extends ApiRoom {

    
    @ResponseParam
    public int[] getIds() {
        return new int[] {1};
    }

}
