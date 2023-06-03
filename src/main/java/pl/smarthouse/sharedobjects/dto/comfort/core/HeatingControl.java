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
public class HeatingControl {
  private boolean heatingEnabled;
  private double lowTolerance;
  private double overheatingOn2Tariff;

  private Set<TimeRange> workdayTimeRanges;
  private Set<TimeRange> weekendTimeRanges;
}
