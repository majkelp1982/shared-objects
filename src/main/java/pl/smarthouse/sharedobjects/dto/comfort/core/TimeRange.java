package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.time.LocalTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TimeRange {
  LocalTime from;
  LocalTime to;
}
