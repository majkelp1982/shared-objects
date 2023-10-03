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
  String moduleName;
  String serviceAddress;
  LocalDateTime updateTimestamp;
  boolean error;
  boolean errorPendingAcknowledge;
}
