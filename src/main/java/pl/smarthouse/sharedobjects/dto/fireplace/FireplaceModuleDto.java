package pl.smarthouse.sharedobjects.dto.fireplace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.core.Ds18b20ResultDto;
import pl.smarthouse.sharedobjects.dto.fireplace.core.Throttle;
import pl.smarthouse.sharedobjects.dto.fireplace.enums.Mode;
import pl.smarthouse.sharedobjects.dto.fireplace.enums.State;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FireplaceModuleDto extends ModuleDto {
  private Mode mode;
  private State state;
  private Ds18b20ResultDto waterIn;
  private Ds18b20ResultDto waterOut;
  private Ds18b20ResultDto chimney;
  private State pump;
  private Throttle throttle;
}
