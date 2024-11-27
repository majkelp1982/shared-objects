package pl.smarthouse.sharedobjects.dto.zigbee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class ZigbeeDevice {
  @Transient private Definition definition;
  @Transient private String friendly_name;

  @JsonProperty("ieee_address")
  private String ieeeAddress;

  @JsonProperty("linkquality")
  private int linkQuality;

  private LocalDateTime lastUpdate;

  public String getLastUpdateString() {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM HH:mm");
    if (lastUpdate != null) {
      return lastUpdate.format(formatter);
    } else {
      return null;
    }
  }

  @NoArgsConstructor
  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public class Definition {
    String description;
    String model;
  }
}
