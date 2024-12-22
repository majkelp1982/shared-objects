package pl.smarthouse.sharedobjects.dto.chillzone;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;

@Data
@SuperBuilder
public class ChillZoneModuleDto extends ModuleDto {
  private final SpaDevice sauna;
  private final SpaDevice chillRoom;
}
