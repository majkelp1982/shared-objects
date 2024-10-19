package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Data;
import pl.smarthouse.sharedobjects.dto.core.enums.State;
import pl.smarthouse.sharedobjects.dto.lightsmqtt.LightZone;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Light {
  LightZone lightZone;
  String address;
  int brightness;

  @JsonProperty(value = "color_temp")
  int colorTemperature;

  @JsonProperty(value = "linkquality")
  int linkQuality;

  State state;
  private LocalDateTime lastUpdate;
}
