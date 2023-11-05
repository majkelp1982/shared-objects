package pl.smarthouse.sharedobjects.dto.externallights.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LightZoneDto {
  int maxPower;
  int standByPower;
  private boolean forceMax;
  private boolean forceMin;
}
