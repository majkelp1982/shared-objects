package pl.smarthouse.sharedobjects.dto.chillzone;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import pl.smarthouse.sharedobjects.dto.core.enums.SpaDeviceState;
import pl.smarthouse.sharedobjects.dto.core.enums.State;
import pl.smarthouse.smartmodule.model.actors.type.bme280.Bme280Response;

@Data
@NoArgsConstructor
public class SpaDevice {
  private State state;
  private SpaDeviceState relayState;
  private Bme280Response bme280ResponseDto;
  @Transient LocalDateTime stateOnTriggerTimeStamp;
  private long leftHoldTimeInMinutes;
}
