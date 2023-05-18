package pl.smarthouse.sharedobjects.dto.comfort;

import lombok.*;
import pl.smarthouse.sharedobjects.dto.comfort.core.AirExchanger;
import pl.smarthouse.sharedobjects.dto.comfort.core.HumidityAlert;
import pl.smarthouse.sharedobjects.dto.comfort.core.TemperatureControl;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComfortModuleParamsDto {
  private @NonNull AirExchanger airExchanger;
  private @NonNull TemperatureControl temperatureControl;
  private @NonNull HumidityAlert humidityAlert;
}
