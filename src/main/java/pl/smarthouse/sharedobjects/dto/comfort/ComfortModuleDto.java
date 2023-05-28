package pl.smarthouse.sharedobjects.dto.comfort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dto.ModuleDto;
import pl.smarthouse.sharedobjects.dto.core.Bme280ResponseDto;
import pl.smarthouse.sharedobjects.enums.Operation;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComfortModuleDto extends ModuleDto {
  private Bme280ResponseDto sensorResponse;
  private Operation currentOperation;
  private int requiredPower;
  private long leftHoldTimeInMinutes;

  public void setAction(Operation operation, int requiredPower) {
    this.currentOperation = operation;
    this.requiredPower = requiredPower;
  }

  public void setStandby() {
    this.currentOperation = Operation.STANDBY;
    this.requiredPower = 0;
  }
}
