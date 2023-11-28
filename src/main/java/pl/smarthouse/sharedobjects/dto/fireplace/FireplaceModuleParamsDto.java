package pl.smarthouse.sharedobjects.dto.fireplace;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FireplaceModuleParamsDto {
  private double workingTemperature;
  private double warningTemperature;
  private double alarmTemperature;
}
