package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FansDto {
  private final FanDto inlet;
  private final FanDto outlet;
}
