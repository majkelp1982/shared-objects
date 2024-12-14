package pl.smarthouse.sharedobjects.dto.weather;

import java.time.LocalTime;
import lombok.Data;
import org.springframework.data.annotation.Transient;

@Data
public class Sun {
  @Transient LocalTime sunRise;
  @Transient LocalTime sunSet;
  SunState sunState;
}
