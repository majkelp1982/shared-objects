package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import lombok.Data;
import pl.smarthouse.sharedobjects.dto.core.enums.State;

@Data
public class ZoneState {
  State state;
  int brightness;
  int colorTemperature;
  Mode mode;
}
