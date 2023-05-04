package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.ventilation.enums.IntakeThrottleState;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntakeThrottleDto {
  private IntakeThrottleState currentPosition;
  private IntakeThrottleState goalPosition;
}
