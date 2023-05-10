package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ForcedAirControl {
  boolean forcedAirEnabled;
  boolean airConditionEnabled;
  double forcedAirTolerance;
  double airConditionTolerance;

  List<TimeRange> workdayTimeRangeList;
  List<TimeRange> weekendTimeRangeList;
}
