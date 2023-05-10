package pl.smarthouse.sharedobjects.dto.comfort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.comfort.core.AirExchanger;
import pl.smarthouse.sharedobjects.dto.comfort.core.HumidityAlert;
import pl.smarthouse.sharedobjects.dto.comfort.core.TemperatureControl;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComfortModuleSettingsDto {
  private @NonNull AirExchanger airExchanger;
  private @NonNull TemperatureControl temperatureControl;
  private @NonNull HumidityAlert humidityAlert;
}
