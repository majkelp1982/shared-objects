package pl.smarthouse.sharedobjects.dto.core;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Bme280ResponseDto extends ResponseDto {
  private double temperature;
  private double pressure;
  private int humidity;
  private boolean error;
}
