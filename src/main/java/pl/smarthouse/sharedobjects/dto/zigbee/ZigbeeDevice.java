package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZigbeeDevice {
  Definition definition;
  String friendly_name;
  String ieee_address;

  @NoArgsConstructor
  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  private class Definition {
    String description;
    String model;
  }
}
