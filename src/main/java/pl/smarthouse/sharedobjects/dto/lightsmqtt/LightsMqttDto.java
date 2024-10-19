package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import java.util.HashMap;
import lombok.Data;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.zigbee.Light;

@Data
public class LightsMqttDto extends ModuleDto {
  HashMap<LightZone, ZoneState> requireZoneStates;
  HashMap<String, Light> lights;
}
