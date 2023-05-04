package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.*;
import pl.smarthouse.sharedobjects.dto.ventilation.enums.ThrottleState;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThrottleDto {
  private ThrottleState currentPosition;
  private ThrottleState goalPosition;
}
