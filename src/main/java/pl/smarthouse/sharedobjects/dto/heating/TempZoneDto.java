package pl.smarthouse.sharedobjects.dto.heating;

import lombok.Data;

// Temporary object until heating module migrated
@Data
public class TempZoneDto {
  private int zoneNumber;
  private float temperature;
  private float reqTemperature;
}
