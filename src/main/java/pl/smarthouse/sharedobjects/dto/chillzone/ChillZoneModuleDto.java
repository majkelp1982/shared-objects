package pl.smarthouse.sharedobjects.dto.chillzone;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;

@Data
@SuperBuilder
@NoArgsConstructor
public class ChillZoneModuleDto extends ModuleDto {
  private SpaDevice sauna;
  private SpaDevice chillRoom;
}
