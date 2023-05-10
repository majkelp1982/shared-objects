package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HeatingControl {
  boolean heatingEnabled;
  double lowTolerance;
  double overheatingOn2Tariff;

  List<TimeRange> workdayTimeRangeList;
  List<TimeRange> weekendTimeRangeList;
}
