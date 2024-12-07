package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import java.util.List;
import lombok.Data;
import pl.smarthouse.sharedobjects.dto.zigbee.Snzb03;

@Data
public class MotionSensor {
  List<LightZone> lightZones;
  Snzb03 sensor;
}
