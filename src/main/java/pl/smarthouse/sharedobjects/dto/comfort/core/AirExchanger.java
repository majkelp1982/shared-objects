package pl.smarthouse.sharedobjects.dto.comfort.core;

import java.util.List;
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
  private List<TimeRange> workdayTimeRangeList;
  private List<TimeRange> weekendTimeRangeList;
}
