package pl.smarthouse.sharedobjects.dto.zigbee;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Transient;

@Data
@SuperBuilder
public abstract class ZigbeeSensor {
  @Transient private String ieeeAddress;
  private LocalDateTime lastUpdate;
}
