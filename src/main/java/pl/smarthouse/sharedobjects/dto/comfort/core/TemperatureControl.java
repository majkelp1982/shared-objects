package pl.smarthouse.sharedobjects.dto.comfort.core;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemperatureControl {
  double requiredTemperature;
  HeatingControl heatingControl;
  ForcedAirControl forcedAirControl;
}
