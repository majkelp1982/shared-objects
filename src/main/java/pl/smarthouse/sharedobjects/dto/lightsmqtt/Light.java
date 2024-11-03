package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import lombok.Data;
import pl.smarthouse.sharedobjects.dto.zigbee.LightDevice;

@Data
public class Light {
  LightZone lightZone;
  LightDevice lightDevice;
}
