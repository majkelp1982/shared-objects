package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Snzb03 extends ZigbeeDevice {
  int battery;

  @JsonProperty("battery_low")
  boolean batteryLow;

  boolean occupancy;
  boolean tamper;
  int voltage;
}
