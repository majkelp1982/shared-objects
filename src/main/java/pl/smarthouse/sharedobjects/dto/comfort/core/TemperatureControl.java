package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.time.LocalDate;
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
  private LocalDate disableTimeRangesUntilDate;
  private HeatingControl heatingControl;
  private ForcedAirControl forcedAirControl;
}
