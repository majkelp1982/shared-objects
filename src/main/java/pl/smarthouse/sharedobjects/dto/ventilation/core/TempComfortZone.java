package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.enums.Operation;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempComfortZone {
  boolean enabled;
  private double temperature;
  private int humidity;
  private double requiredTemperature;

  private boolean forcedAirSystemEnabled;

  private Operation currentOperation;

  public TempComfortZone(final boolean enabled) {
    this.enabled = enabled;
  }
}
