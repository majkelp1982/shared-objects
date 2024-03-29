package pl.smarthouse.sharedobjects.dto.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.core.enums.PinState;

@Data
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class PinResponseDto extends ResponseDto {
  private PinState pinState;
  private int pinValue;
  private int counter;
}
