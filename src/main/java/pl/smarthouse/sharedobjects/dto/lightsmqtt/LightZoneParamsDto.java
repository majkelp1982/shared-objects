package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class LightZoneParamsDto {

  @Min(10)
  @Max(100)
  int standby;

  int colorTemperature;
}
