package pl.smarthouse.sharedobjects.dto.comfort.core;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HumidityAlert {
  boolean enabled;
  int maxHumidity;
  int delayTimeInMinutes;
}
