package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Snzb03 extends ZigbeeSensor {
  int battery;

  @JsonProperty("battery_low")
  boolean batteryLow;

  @JsonProperty("linkuqality")
  int linkQuality;

  boolean occupancy;
  boolean tamper;
  int voltage;
}
