package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.smarthouse.sharedobjects.dto.core.enums.State;

@Data
@AllArgsConstructor
public class ZoneState {
  State state;
  int brightness;
  int colorTemperature;
}
