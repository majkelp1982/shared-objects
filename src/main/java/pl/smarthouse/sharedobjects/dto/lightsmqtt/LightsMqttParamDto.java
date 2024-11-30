package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import java.util.HashMap;
import lombok.Data;
import pl.smarthouse.sharedobjects.dto.core.TimeRange;

@Data
public class LightsMqttParamDto {
  HashMap<LightZone, LightZoneParamsDto> zoneParams;
  HashMap<String, LightZone> lights;
  HashMap<String, LightZone> motionSensors;
  TimeRange enableTimeRange;
}
