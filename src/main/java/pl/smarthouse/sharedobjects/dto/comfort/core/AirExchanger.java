package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirExchanger {
  private boolean enabled;
  private int requiredPower;
  private Set<TimeRange> workdayTimeRanges;
  private Set<TimeRange> weekendTimeRanges;
}
