package pl.smarthouse.sharedobjects.dto.ventilation;

import lombok.*;
import pl.smarthouse.sharedobjects.dto.comfort.core.TimeRange;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VentModuleParamsDto {
  private boolean humidityAlertEnabled;
  private boolean airExchangeEnabled;
  private boolean airHeatingEnabled;
  private boolean airCoolingEnabled;
  private boolean airConditionEnabled;
  private boolean nightHoursEnabled;

  private TimeRange nightHours;
  private int inletFanNightHoursMaxPower;
  private int outletFanNightHoursMaxPower;
}
