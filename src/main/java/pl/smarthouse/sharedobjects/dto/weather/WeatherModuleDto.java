package pl.smarthouse.sharedobjects.dto.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.core.Bme280ResponseDto;
import pl.smarthouse.sharedobjects.dto.core.Sds011ResponseDto;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherModuleDto extends ModuleDto {
  private Sds011ResponseDto sds011Response;
  private Bme280ResponseDto bme280Response;
  private Sun sun;
}
