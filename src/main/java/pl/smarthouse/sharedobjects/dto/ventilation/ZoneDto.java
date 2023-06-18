package pl.smarthouse.sharedobjects.dto.ventilation;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.ventilation.core.ThrottleDto;
import pl.smarthouse.sharedobjects.dto.ventilation.enums.FunctionType;
import pl.smarthouse.sharedobjects.enums.Operation;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZoneDto {
  private LocalDateTime lastUpdate;
  private FunctionType functionType;
  private Operation operation;
  private ThrottleDto throttle;
  private int requiredPower;
}
