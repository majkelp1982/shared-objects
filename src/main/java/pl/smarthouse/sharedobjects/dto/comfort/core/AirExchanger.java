package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AirExchanger {
  boolean enabled;
  int stateChangeInMinutes;
  int onTimeInMinutes;
  int offTimeInMinutes;

  List<TimeRange> workdayTimeRangeList;
  List<TimeRange> weekendTimeRangeList;
}
