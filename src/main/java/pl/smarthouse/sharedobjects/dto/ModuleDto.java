package pl.smarthouse.sharedobjects.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class ModuleDto {
  private String type;
  private String moduleMacAddress;
  private String serviceVersion;
  private String moduleFirmwareVersion;
  private String moduleIpAddress;
  private String serviceAddress;
  LocalDateTime moduleUpdateTimestamp;
  LocalDateTime serviceUpdateTimestamp;
  LocalDateTime valuesUpdateTimestamp;
  boolean connectionEstablish;
  boolean error;
  boolean errorPendingAcknowledge;
  long uptimeInMinutes;
}
