package pl.smarthouse.sharedobjects.dto.core;

import java.time.LocalDateTime;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class ResponseDto {
  protected LocalDateTime responseUpdate;
}
