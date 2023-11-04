package pl.smarthouse.sharedobjects.dto.core;

import lombok.*;
import lombok.experimental.SuperBuilder;

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
