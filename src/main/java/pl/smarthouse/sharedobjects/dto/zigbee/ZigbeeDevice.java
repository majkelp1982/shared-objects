package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZigbeeDevice {
  @Transient private Definition definition;
  @Transient private String friendly_name;

  @JsonProperty("ieee_address")
  private String ieeeAddress;

  @JsonProperty("linkquality")
  private int linkQuality;

  private LocalDateTime lastUpdate;

  @NoArgsConstructor
  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public class Definition {
    String description;
    String model;
  }
}
