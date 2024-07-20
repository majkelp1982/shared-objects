package pl.smarthouse.sharedobjects.dto.comfort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.comfort.core.TimeRangeMode;
import pl.smarthouse.sharedobjects.dto.core.Bme280ResponseDto;
import pl.smarthouse.sharedobjects.dto.ventilation.enums.FunctionType;
import pl.smarthouse.sharedobjects.enums.Operation;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComfortModuleDto extends ModuleDto {
  private Bme280ResponseDto sensorResponse;
  private FunctionType functionType;
  private Operation currentOperation;
  private TimeRangeMode timeRangeMode;
  private int requiredPower;
  private long leftHoldTimeInMinutes;

  public void setAction(final Operation operation, final int requiredPower) {
    this.currentOperation = operation;
    this.requiredPower = requiredPower;
  }

  public void setStandby() {
    this.currentOperation = Operation.STANDBY;
    this.requiredPower = 0;
  }
}
