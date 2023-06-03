package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForcedAirControl {
  private boolean forcedAirEnabled;
  private boolean airConditionEnabled;
  private double forcedAirTolerance;
  private double airConditionTolerance;
  private int forcedAirRequiredPower;
  private int airConditionRequiredPower;

  private Set<TimeRange> workdayTimeRanges;
  private Set<TimeRange> weekendTimeRanges;
}
