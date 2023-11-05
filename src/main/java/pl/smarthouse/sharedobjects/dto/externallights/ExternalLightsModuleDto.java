package pl.smarthouse.sharedobjects.dto.externallights;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.externallights.core.LightZoneDto;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalLightsModuleDto extends ModuleDto {
  private LightZoneDto entrance;
  private LightZoneDto driveway;
  private LightZoneDto carport;
  private LightZoneDto garden;
}
