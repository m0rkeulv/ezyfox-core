/**
 * 
 */
package com.tvd12.ezyfox.core.testing.roomextensionconfig2;

import com.tvd12.ezyfox.core.annotation.AdditionalClientRequestListeners;
import com.tvd12.ezyfox.core.annotation.PackagesScan;
import com.tvd12.ezyfox.core.annotation.RoomContextConfiguration;

/**
 * @author tavandung12
 *
 */
@RoomContextConfiguration
@PackagesScan(packages = {"com.tvd12.ezyfox.core.testing.roomextensionconfig2"})
@AdditionalClientRequestListeners({
    "com.tvd12.ezyfox.core.testing.newroomextensionconfig2_ex.ExClientRequestListener3"
})
public class RoomConfig2 {

}
