package pl.smarthouse.sharedobjects.dto.core;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class RdbDimmerResponseDto extends ResponseDto {
  private String mode;
  private boolean state;
  private int power;
  private int goalPower;
  private boolean incremental;
  private int msDelay;
}
