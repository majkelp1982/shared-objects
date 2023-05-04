package pl.smarthouse.sharedobjects.dto.comfort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.smarthouse.sharedobjects.dto.core.Bme280ResponseDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComfortModuleDto {
  private Bme280ResponseDto sensor;
  private boolean heatingEnabled;
}
