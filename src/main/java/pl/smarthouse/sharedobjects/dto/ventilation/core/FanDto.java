package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FanDto {
  private int currentSpeed;
  private int goalSpeed;
  private int revolution;
}
