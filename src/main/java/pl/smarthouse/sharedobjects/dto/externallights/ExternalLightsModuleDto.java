package pl.smarthouse.sharedobjects.dto.externallights;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.core.RdbDimmerResponseDto;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalLightsModuleDto extends ModuleDto {
  private RdbDimmerResponseDto entrance;
  private RdbDimmerResponseDto driveway;
  private RdbDimmerResponseDto carport;
  private RdbDimmerResponseDto garden;
}
