package pl.smarthouse.sharedobjects.dto.externallights;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.core.TimeRange;
import pl.smarthouse.sharedobjects.dto.externallights.core.LightZoneDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalLightsModuleParamsDto {
  TimeRange enableTimeRange;
  private LightZoneDto entrance;
  private LightZoneDto driveway;
  private LightZoneDto carport;
  private LightZoneDto garden;
  private int lightIntenseThreshold;
}
