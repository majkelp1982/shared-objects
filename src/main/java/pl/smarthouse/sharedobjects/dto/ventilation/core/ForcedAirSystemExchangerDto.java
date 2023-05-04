package pl.smarthouse.sharedobjects.dto.ventilation.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.core.Ds18b20ResultDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForcedAirSystemExchangerDto {
  private Ds18b20ResultDto watterIn;
  private Ds18b20ResultDto watterOut;
  private Ds18b20ResultDto airIn;
  private Ds18b20ResultDto airOut;
}
