package pl.smarthouse.sharedobjects.dto.externallights.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.core.RdbDimmerResponseDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LightZoneDto {
  RdbDimmerResponseDto rdbDimmerResponse;
  private boolean forceMax;
  private boolean forceMin;
}
