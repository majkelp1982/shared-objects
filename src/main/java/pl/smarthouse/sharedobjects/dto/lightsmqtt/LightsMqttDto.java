package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import java.util.Map;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.zigbee.Ledvance;

public class LightsMqttDto extends ModuleDto {
  Map<LightZone, Ledvance> lights;
}
