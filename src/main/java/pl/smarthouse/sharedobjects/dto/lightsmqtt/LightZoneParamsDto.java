package pl.smarthouse.sharedobjects.dto.lightsmqtt;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class LightZoneParamsDto {

  @Min(1)
  @Max(254)
  int standby;

  @Min(50)
  @Max(500)
  int colorTemperature;

  int holdTime;
}
