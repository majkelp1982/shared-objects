package pl.smarthouse.sharedobjects.dto.core;

import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ds18b20ResultDto {
  private String address;
  private float temp;
  private boolean error;
  private LocalDateTime lastUpdate;
}
