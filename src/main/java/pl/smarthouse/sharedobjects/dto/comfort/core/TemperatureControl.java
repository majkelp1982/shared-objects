package pl.smarthouse.sharedobjects.dto.comfort.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TemperatureControl {
  private double requiredTemperature;
  private HeatingControl heatingControl;
  private ForcedAirControl forcedAirControl;
}
