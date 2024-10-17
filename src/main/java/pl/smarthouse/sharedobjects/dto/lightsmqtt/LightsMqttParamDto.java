package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import java.util.HashMap;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.core.TimeRange;

public class LightsMqttParamDto extends ModuleDto {
  HashMap<LightZone, LightParamDto> lightParams;
  TimeRange enableTimeRange;
}
