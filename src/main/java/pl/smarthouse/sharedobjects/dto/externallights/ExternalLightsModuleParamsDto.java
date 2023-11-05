package pl.smarthouse.sharedobjects.dto.externallights;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.core.TimeRange;
import pl.smarthouse.sharedobjects.dto.externallights.core.LightZoneParamDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalLightsModuleParamsDto {
  TimeRange enableTimeRange;
  private LightZoneParamDto entrance;
  private LightZoneParamDto driveway;
  private LightZoneParamDto carport;
  private LightZoneParamDto garden;
  private int lightIntenseThreshold;
}
