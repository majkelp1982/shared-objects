package pl.smarthouse.sharedobjects.dto.core;

import lombok.*;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.core.enums.Sds011State;

@Data
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Sds011ResponseDto extends ResponseDto {
  private Sds011State mode;
  private double pm025;
  private double pm10;
}
