package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeatingControl {
  private boolean heatingEnabled;
  private double lowTolerance;
  private double overheatingOn2Tariff;

  private List<TimeRange> workdayTimeRangeList;
  private List<TimeRange> weekendTimeRangeList;
}
