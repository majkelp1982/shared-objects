package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.smarthouse.sharedobjects.dto.core.enums.State;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = true)
public class LightDevice extends ZigbeeDevice {
  int brightness;

  @JsonProperty(value = "color_temp")
  int colorTemperature;

  State state;
}
