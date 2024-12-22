package pl.smarthouse.sharedobjects.dto.chillzone;

import lombok.Data;

@Data
public class SpaDeviceParam {
  private boolean enabled;
  private double minRequiredTemperature;
  private double requiredTemperature;
  private int holdTimeInMinutes;
}
