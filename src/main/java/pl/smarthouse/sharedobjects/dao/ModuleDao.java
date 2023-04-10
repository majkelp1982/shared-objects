package pl.smarthouse.sharedobjects.dao;

import lombok.Data;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Transient;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public abstract class ModuleDao {
	@NonNull @Transient protected String moduleName;
	LocalDateTime saveTimestamp;
}
