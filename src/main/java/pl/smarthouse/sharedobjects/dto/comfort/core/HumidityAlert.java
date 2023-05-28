package pl.smarthouse.sharedobjects.dto.comfort.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HumidityAlert {
  private boolean enabled;
  private int maxHumidity;
  private int requiredPower;
  private int requiredTurboPower;
  private int holdTimeInMinutes;
}
