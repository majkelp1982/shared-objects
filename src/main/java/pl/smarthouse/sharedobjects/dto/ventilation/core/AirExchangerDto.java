package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.core.Bme280ResponseDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirExchangerDto {
  private Bme280ResponseDto inlet;
  private Bme280ResponseDto outlet;
  private Bme280ResponseDto freshAir;
  private Bme280ResponseDto userAir;
}
