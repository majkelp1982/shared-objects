package pl.smarthouse.sharedobjects.dto.fireplace.core;

import lombok.*;

@Data
@NoArgsConstructor
public class Throttle {
  private int currentPosition;
  private int goalPosition;
}
