package pl.smarthouse.sharedobjects.dto.core;

import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeRange {
  private LocalTime from;
  private LocalTime to;
}
