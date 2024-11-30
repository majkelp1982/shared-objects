package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import lombok.Data;
import pl.smarthouse.sharedobjects.dto.zigbee.Snzb03;

@Data
public class MotionSensor {
  LightZone lightZone;
  Snzb03 sensor;
}
