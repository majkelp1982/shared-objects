package pl.smarthouse.sharedobjects.dto.comfort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pl.smarthouse.sharedobjects.dao.ModuleDto;
import pl.smarthouse.sharedobjects.dto.core.Bme280ResponseDto;
import pl.smarthouse.sharedobjects.enums.Operation;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ComfortModuleDto extends ModuleDto {
  private Bme280ResponseDto sensor;
  private Operation currentOperation;
}
