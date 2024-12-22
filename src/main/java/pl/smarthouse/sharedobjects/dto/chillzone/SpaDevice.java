package pl.smarthouse.sharedobjects.dto.chillzone;

import lombok.Data;
import pl.smarthouse.sharedobjects.dto.core.enums.State;
import pl.smarthouse.smartmodule.model.actors.type.bme280.Bme280Response;

@Data
public class SpaDevice {
  private State state;
  private Bme280Response bme280ResponseDto;
  private long leftHoldTimeInMinutes;
}
